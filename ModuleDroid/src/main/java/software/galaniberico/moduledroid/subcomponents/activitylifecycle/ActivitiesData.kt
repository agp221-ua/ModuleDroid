package software.galaniberico.moduledroid.subcomponents.activitylifecycle

import android.annotation.SuppressLint
import android.app.Activity

@SuppressLint("StaticFieldLeak")
internal object ActivitiesData {
    internal var currentActivity: Activity? = null
    internal var creatingActivity: Activity? = null
    internal var startingActivity: Activity? = null
    internal var resumingActivity: Activity? = null

    fun getCurrentActivity(): Activity? {
        return currentActivity
    }
    fun getCreatingActivity(): Activity? {
        return creatingActivity
    }
    fun getStartingActivity(): Activity? {
        return startingActivity
    }
    fun getResumingActivity(): Activity? {
        return resumingActivity
    }


}