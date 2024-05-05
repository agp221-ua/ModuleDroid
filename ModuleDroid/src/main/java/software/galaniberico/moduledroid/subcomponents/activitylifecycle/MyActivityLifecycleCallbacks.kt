package software.galaniberico.moduledroid.subcomponents.activitylifecycle

import android.app.Activity
import android.app.Application
import android.os.Bundle

internal class MDActivityLifecycleCallbacks : Application.ActivityLifecycleCallbacks {

    override fun onActivityPreCreated(activity: Activity, savedInstanceState: Bundle?) {
        ActivitiesData.creatingActivity = activity
        ActivityLifecycleSubscriptionManager.onPreCreateSuscriptions.forEach{it(activity, savedInstanceState)}
    }
    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
        ActivityLifecycleSubscriptionManager.onCreateSuscriptions.forEach{it(activity, savedInstanceState)}
    }

    override fun onActivityPostCreated(activity: Activity, savedInstanceState: Bundle?) {
        ActivityLifecycleSubscriptionManager.onPostCreateSuscriptions
    }

    override fun onActivityPreStarted(activity: Activity) {
        ActivitiesData.startingActivity = activity
        ActivityLifecycleSubscriptionManager.onPreStartSuscriptions.forEach{it(activity)}
    }

    override fun onActivityStarted(p0: Activity) {
        ActivityLifecycleSubscriptionManager.onStartSuscriptions.forEach{it(p0)}
    }

    override fun onActivityPostStarted(activity: Activity) {
        ActivityLifecycleSubscriptionManager.onPostStartSuscriptions.forEach{it(activity)}
    }

    override fun onActivityPreResumed(activity: Activity) {
        ActivitiesData.resumingActivity = activity
        ActivityLifecycleSubscriptionManager.onPreResumeSuscriptions.forEach{it(activity)}
    }
    override fun onActivityResumed(p0: Activity) {
        ActivityLifecycleSubscriptionManager.onResumeSuscriptions.forEach{it(p0)}
    }

    override fun onActivityPostResumed(activity: Activity) {
        ActivitiesData.currentActivity = activity
        ActivitiesData.creatingActivity = null
        ActivitiesData.startingActivity = null
        ActivitiesData.resumingActivity = null
        ActivityLifecycleSubscriptionManager.onPostResumeSuscriptions.forEach{it(activity)}
    }

    override fun onActivityPrePaused(p0: Activity) {
        ActivityLifecycleSubscriptionManager.onPrePauseSuscriptions.forEach{it(p0)}
    }

    override fun onActivityPaused(p0: Activity) {
        ActivityLifecycleSubscriptionManager.onPauseSuscriptions.forEach{it(p0)}
    }

    override fun onActivityPostPaused(p0: Activity) {
        ActivityLifecycleSubscriptionManager.onPostPauseSuscriptions.forEach{it(p0)}
    }

    override fun onActivityPreStopped(p0: Activity) {
        ActivityLifecycleSubscriptionManager.onPreStopSuscriptions.forEach{it(p0)}
    }

    override fun onActivityStopped(p0: Activity) {  //TODO revise because does not work correctly
        if(p0.isChangingConfigurations){
            ActivityLifecycleSubscriptionManager.onRestartSuscriptions.forEach{it(p0)}
        } else {
            ActivityLifecycleSubscriptionManager.onStopSuscriptions.forEach{it(p0)}
        }
    }

    override fun onActivityPostStopped(p0: Activity) {
        ActivityLifecycleSubscriptionManager.onPostStopSuscriptions.forEach{it(p0)}
    }

    override fun onActivityPreDestroyed(p0: Activity) {
        ActivityLifecycleSubscriptionManager.onPreDestroySuscriptions.forEach{it(p0)}
    }

    override fun onActivityDestroyed(p0: Activity) {
        ActivityLifecycleSubscriptionManager.onDestroySuscriptions.forEach{it(p0)}
    }

    override fun onActivityPostDestroyed(p0: Activity) {
        ActivityLifecycleSubscriptionManager.onPostDestroySuscriptions.forEach{it(p0)}
    }

    override fun onActivitySaveInstanceState(p0: Activity, p1: Bundle) {
        ActivityLifecycleSubscriptionManager.onSaveInstanceStateSuscriptions.forEach{it(p0, p1)}
    }



}