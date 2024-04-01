package software.galaniberico.moduledroid.facade

import android.app.Activity
import software.galaniberico.moduledroid.subcomponents.intentmanager.ID_KEY
import software.galaniberico.moduledroid.subcomponents.intentmanager.LocalIntentManager

internal object FacadeIntentManager {
    fun getIdKey(): String{
        return ID_KEY
    }
    fun startActivity(target: Class<out Activity>, id: String? = null): String {
        return LocalIntentManager.startActivity(target, id)
    }

    fun startActivityForResult(target: Class<out Activity>, id: String? = null, requestCode: Int? = null): Pair<String, Int>{
        return if (requestCode != null) {
            LocalIntentManager.startActivityForResult(target,id, requestCode)
        } else {
            LocalIntentManager.startActivityForResult(target, id)
        }
    }

    fun startActivity(activity: Activity, target: Class<out Activity>, id: String? = null): String {
        return LocalIntentManager.startActivity(activity, target, id)
    }

    fun startActivityForResult(activity: Activity, target: Class<out Activity>, id: String? = null, requestCode: Int? = null): Pair<String, Int>{
        return if (requestCode != null) {
            LocalIntentManager.startActivityForResult(activity, target,id, requestCode)
        } else {
            LocalIntentManager.startActivityForResult(activity, target, id)
        }
    }
}