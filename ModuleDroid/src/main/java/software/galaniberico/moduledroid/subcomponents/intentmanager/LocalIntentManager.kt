package software.galaniberico.moduledroid.subcomponents.intentmanager

import android.app.Activity
import android.content.Intent
import software.galaniberico.moduledroid.internalbus.InternalBus

private const val CURRENT_ACTIVITY = "CURRENT_ACTIVITY"

private const val ID_PREFIX = "###ModuleDroid_IntentManager@"
internal const val ID_KEY = "###ModuleDroid_IntentManager@ID###"
internal const val INTERNAL_ID_KEY = "###ModuleDroid_IntentManager@INTERNAL_ID###"

internal object LocalIntentManager {
    private var nextID: Int = 0
    private var nextDefaultValue: Int =
        10000  //Start with 10000 to try to avoid collisions with more common values as 0,1,2...

    fun startActivity(
        target: Class<out Activity>,
        id: String? = null,
        preaction: (intent: Intent, id: String, internalId: String) -> Unit = { _, _,_ -> }
    ): String {
        val activity: Activity = InternalBus.get(CURRENT_ACTIVITY)
        val i = Intent(activity, target)
        val internalId = generateDefaultId()
        val _id = id ?: internalId
        i.putExtra(ID_KEY, _id)
        i.putExtra(INTERNAL_ID_KEY, internalId)
        preaction(i, _id, internalId)
        activity.startActivity(i)
        return _id
    }

    fun startActivity(
        activity: Activity,
        target: Class<out Activity>,
        id: String? = null,
        preaction: (intent: Intent, id: String, internalId: String) -> Unit = { _, _,_  -> }
    ): String {
        val i = Intent(activity, target)
        val internalId = generateDefaultId()
        val _id = id ?: internalId
        i.putExtra(ID_KEY, _id)
        i.putExtra(INTERNAL_ID_KEY, internalId)
        preaction(i, _id, internalId)
        activity.startActivity(i)
        return _id
    }

    fun startActivityForResult(
        target: Class<out Activity>,
        id: String? = null,
        preaction: (intent: Intent, id: String, internalId: String) -> Unit,
        requestCode: Int = nextDefaultValue++
    ): Pair<String, Int> {
        val activity: Activity = InternalBus.get(CURRENT_ACTIVITY)
        val i = Intent(activity, target)
        val internalId = generateDefaultId()
        val _id = id ?: internalId
        i.putExtra(ID_KEY, _id)
        i.putExtra(INTERNAL_ID_KEY, internalId)
        preaction(i, _id, internalId)
        activity.startActivityForResult(i, requestCode)
        return Pair(_id, requestCode)
    }

    fun startActivityForResult(
        activity: Activity,
        target: Class<out Activity>,
        id: String? = null,
        preaction: (intent: Intent, id: String, internalId: String) -> Unit,
        requestCode: Int = nextDefaultValue++
    ): Pair<String, Int> {
        val i = Intent(activity, target)
        val internalId = generateDefaultId()
        val _id = id ?: internalId
        i.putExtra(ID_KEY, _id)
        i.putExtra(INTERNAL_ID_KEY, internalId)
        preaction(i, _id, internalId)
        activity.startActivityForResult(i, requestCode)
        return Pair(_id, requestCode)
    }

    private fun generateDefaultId(): String {
        return ID_PREFIX + nextID++
    }

    fun provideId(activity: Activity): String {
        val id = generateDefaultId()
        activity.intent.putExtra(ID_KEY, id)
        activity.intent.putExtra(INTERNAL_ID_KEY, id)
        return id
    }

    fun getId(activity: Activity): String? {
        return activity.intent.getStringExtra(ID_KEY)
    }
    fun getInternalId(activity: Activity): String {
        return activity.intent.getStringExtra(INTERNAL_ID_KEY) ?: provideId(activity)
    }

    fun getIdOrProvideOne(activity: Activity): String {
        return getId(activity) ?: provideId(activity)
    }

}