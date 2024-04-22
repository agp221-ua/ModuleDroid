package software.galaniberico.moduledroid.subcomponents.activitylifecycle

import android.app.Activity
import android.app.Application
import android.os.Bundle

internal class MDActivityLifecycleCallbacks : Application.ActivityLifecycleCallbacks {
    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
        ActivityLifecycleSubscriptionManager.onCreateSuscriptions.forEach{it(activity, savedInstanceState)}
        //TODO must add an id here o maybe compare it from where is compared, this is, inside 'it', if
        //      a check is needed, compare it with the intent manager to check if has the expected id
        //      or is the correct class (intent manager must know the class of the expected intent)

        //TODO do in all other callbacks
    }

    override fun onActivityStarted(p0: Activity) {
        ActivityLifecycleSubscriptionManager.onStartSuscriptions.forEach{it(p0)}

    }

    override fun onActivityResumed(p0: Activity) {
        ActivityLifecycleSubscriptionManager.onResumeSuscriptions.forEach{it(p0)}

    }

    override fun onActivityPostResumed(activity: Activity) {
        super.onActivityPostResumed(activity)
        ActivitiesData.currentActivity = activity
    }

    override fun onActivityPaused(p0: Activity) {
        ActivityLifecycleSubscriptionManager.onPauseSuscriptions.forEach{it(p0)}
    }

    override fun onActivityStopped(p0: Activity) {  //TODO revise because does not work correctly
        if(p0.isChangingConfigurations){
            ActivityLifecycleSubscriptionManager.onRestartSuscriptions.forEach{it(p0)}
        } else {
            ActivityLifecycleSubscriptionManager.onStopSuscriptions.forEach{it(p0)}
        }
    }

    override fun onActivityDestroyed(p0: Activity) {
        ActivityLifecycleSubscriptionManager.onDestroySuscriptions.forEach{it(p0)}
    }

    override fun onActivitySaveInstanceState(p0: Activity, p1: Bundle) {
        ActivityLifecycleSubscriptionManager.onSaveInstanceStateSuscriptions.forEach{it(p0, p1)}
    }



}