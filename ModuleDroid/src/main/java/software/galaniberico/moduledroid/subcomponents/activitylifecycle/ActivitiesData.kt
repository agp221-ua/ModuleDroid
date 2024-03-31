package software.galaniberico.moduledroid.subcomponents.activitylifecycle

import android.annotation.SuppressLint
import android.app.Activity

@SuppressLint("StaticFieldLeak")
internal object ActivitiesData {
    internal var currentActivity: Activity? = null

    fun getCurrentActivity(): Activity? {
        return currentActivity
    }
}