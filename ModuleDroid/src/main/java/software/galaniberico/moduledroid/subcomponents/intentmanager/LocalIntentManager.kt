package software.galaniberico.moduledroid.subcomponents.intentmanager

import android.app.Activity
import android.content.Intent
import software.galaniberico.moduledroid.internalbus.InternalBus

private const val CURRENT_ACTIVITY = "CURRENT_ACTIVITY"

private const val ID_PREFIX = "###ModuleDroid_IntentManager@"
internal const val ID_KEY = "###ModuleDroid_IntentManager@ID###"

internal object LocalIntentManager {
    private var nextID: Int = 0
    private var nextDefaultValue: Int = 10000  //Start with 10000 to try to avoid collisions with more common values as 0,1,2...

    fun startActivity(target: Class<out Activity>, id: String? = null): String {
        val activity: Activity = InternalBus.get(CURRENT_ACTIVITY)
        val i = Intent(activity, target)
        val _id = id ?: generateDefaultId()
        i.putExtra(ID_KEY, _id)
        activity.startActivity(i)
        return _id
    }

    fun startActivity(activity: Activity, target: Class<out Activity>, id: String? = null): String {
        val i = Intent(activity, target)
        val _id = id ?: generateDefaultId()
        i.putExtra(ID_KEY, _id)
        activity.startActivity(i)
        return _id
    }

    fun startActivityForResult(target: Class<out Activity>, id: String? = null, requestCode: Int = nextDefaultValue++): Pair<String, Int> {
        val activity: Activity = InternalBus.get(CURRENT_ACTIVITY)
        val i = Intent(activity, target)
        val _id = id ?: generateDefaultId()
        i.putExtra(ID_KEY, _id)
        activity.startActivityForResult(i, requestCode)
        return Pair(_id, requestCode)
    }

    fun startActivityForResult(activity: Activity, target: Class<out Activity>, id: String? = null, requestCode: Int = nextDefaultValue++): Pair<String, Int> {
        val i = Intent(activity, target)
        val _id = id ?: generateDefaultId()
        i.putExtra(ID_KEY, _id)
        activity.startActivityForResult(i, requestCode)
        return Pair(_id, requestCode)
    }

    private fun generateDefaultId(): String{
        return ID_PREFIX + nextID++
    }

}