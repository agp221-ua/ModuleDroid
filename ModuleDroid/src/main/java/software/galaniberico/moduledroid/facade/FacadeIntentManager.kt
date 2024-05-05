package software.galaniberico.moduledroid.facade

import android.app.Activity
import android.content.Intent
import software.galaniberico.moduledroid.subcomponents.intentmanager.ID_KEY
import software.galaniberico.moduledroid.subcomponents.intentmanager.LocalIntentManager

internal object FacadeIntentManager {
    fun startActivity(target: Class<out Activity>, id: String? = null, preaction: (intent: Intent, id: String, internalId: String) -> Unit = {_,_,_ -> }): String {
        return LocalIntentManager.startActivity(target, id, preaction)
    }

    fun startActivityForResult(target: Class<out Activity>, id: String? = null, requestCode: Int? = null, preaction: (intent: Intent , id: String, internalId: String) -> Unit = {_,_,_ -> }): Pair<String, Int>{
        return if (requestCode != null) {
            LocalIntentManager.startActivityForResult(target,id, preaction, requestCode)
        } else {
            LocalIntentManager.startActivityForResult(target, id, preaction)
        }
    }

    fun startActivity(activity: Activity, target: Class<out Activity>, id: String? = null, preaction: (intent: Intent , id: String, internalId: String) -> Unit = {_,_,_ -> }): String {
        return LocalIntentManager.startActivity(activity, target, id, preaction)
    }

    fun startActivityForResult(activity: Activity, target: Class<out Activity>, id: String? = null, requestCode: Int? = null, preaction: (intent: Intent , id: String, internalId: String) -> Unit = {_,_,_ -> }): Pair<String, Int>{
        return if (requestCode != null) {
            LocalIntentManager.startActivityForResult(activity, target,id, preaction, requestCode)
        } else {
            LocalIntentManager.startActivityForResult(activity, target, id, preaction)
        }
    }

    fun provideId(activity: Activity) : String {
        return LocalIntentManager.provideId(activity)
    }

    fun getId(activity: Activity) : String? {
        return LocalIntentManager.getId(activity)
    }
    fun getInternalId(activity: Activity) : String {
        return LocalIntentManager.getInternalId(activity)
    }

    fun getIdOrProvideOne(activity: Activity) : String {
        return LocalIntentManager.getIdOrProvideOne(activity)
    }
}