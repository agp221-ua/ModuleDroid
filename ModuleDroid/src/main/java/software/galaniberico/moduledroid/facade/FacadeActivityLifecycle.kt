package software.galaniberico.moduledroid.facade

import android.app.Activity
import android.os.Bundle
import software.galaniberico.moduledroid.subcomponents.activitylifecycle.ActivitiesData
import software.galaniberico.moduledroid.subcomponents.activitylifecycle.ActivityLifecycleSubscriptionManager

internal object FacadeActivityLifecycle {
    fun getCurrentActivity(): Activity? {
        return ActivitiesData.getCurrentActivity()
    }

    fun getCurrentActivityOrFail(): Activity {
        return ActivitiesData.getCurrentActivity()
            ?: throw IllegalStateException("There is not an activity resumed or active. Maybe are you trying to access the activity before is resumed?")
    }

    fun getPreferredActivity(): Activity? {
        return ActivitiesData.getResumingActivity()
            ?: ActivitiesData.getStartingActivity()
            ?: ActivitiesData.getCreatingActivity()
            ?: ActivitiesData.getCurrentActivity()
    }

    fun getPreferredActivityOrFail(): Activity {
        return ActivitiesData.getResumingActivity()
            ?: ActivitiesData.getStartingActivity()
            ?: ActivitiesData.getCreatingActivity()
            ?: ActivitiesData.getCurrentActivity()
            ?: throw IllegalStateException("There is not an activity resumed or active. Maybe are you trying to access the activity before is resumed?")
    }

    fun getCreatingActivity(): Activity? {
        return ActivitiesData.getCreatingActivity()
    }

    fun getCreatingActivityOrFail(): Activity {
        return ActivitiesData.getCreatingActivity()
            ?: throw IllegalStateException("There is not an activity being created.")
    }

    fun getStartingActivity(): Activity? {
        return ActivitiesData.getStartingActivity()
    }

    fun getStartingActivityOrFail(): Activity {
        return ActivitiesData.getStartingActivity()
            ?: throw IllegalStateException("There is not an activity being started.")
    }

    fun getResumingActivity(): Activity? {
        return ActivitiesData.getResumingActivity()
    }

    fun getResumingActivityOrFail(): Activity {
        return ActivitiesData.getResumingActivity()
            ?: throw IllegalStateException("There is not an activity being resumed")
    }

    fun addOnPreCreateSubscription(subscription: (Activity, Bundle?) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnPreCreateSubscription(subscription)
    }

    fun addOnCreateSubscription(subscription: (Activity, Bundle?) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnCreateSubscription(subscription)
    }

    fun addOnPostCreateSubscription(subscription: (Activity, Bundle?) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnPostCreateSubscription(subscription)
    }

    fun addOnRestartSubscription(subscription: (Activity) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnRestartSubscription(subscription)
    }

    fun addOnPreStartSubscription(subscription: (Activity) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnPreStartSubscription(subscription)
    }

    fun addOnStartSubscription(subscription: (Activity) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnStartSubscription(subscription)
    }

    fun addOnPostStartSubscription(subscription: (Activity) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnPostStartSubscription(subscription)
    }

    fun addOnPreResumeSubscription(subscription: (Activity) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnPreResumeSubscription(subscription)
    }

    fun addOnResumeSubscription(subscription: (Activity) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnResumeSubscription(subscription)
    }

    fun addOnPostResumeSubscription(subscription: (Activity) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnPostResumeSubscription(subscription)
    }

    fun addOnPrePauseSubscription(subscription: (Activity) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnPrePauseSubscription(subscription)
    }

    fun addOnPauseSubscription(subscription: (Activity) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnPauseSubscription(subscription)
    }

    fun addOnPostPauseSubscription(subscription: (Activity) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnPostPauseSubscription(subscription)
    }

    fun addOnPreStopSubscription(subscription: (Activity) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnPreStopSubscription(subscription)
    }

    fun addOnStopSubscription(subscription: (Activity) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnStopSubscription(subscription)
    }

    fun addOnPostStopSubscription(subscription: (Activity) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnPostStopSubscription(subscription)
    }


    fun addOnPreDestroySubscription(subscription: (Activity) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnPreDestroySubscription(subscription)
    }

    fun addOnDestroySubscription(subscription: (Activity) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnDestroySubscription(subscription)
    }

    fun addOnPostDestroySubscription(subscription: (Activity) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnPostDestroySubscription(subscription)
    }

    fun addOnSaveInstanceStateSubscription(subscription: (Activity, Bundle) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnSaveInstanceStateSubscription(subscription)
    }

    fun addOnRestartSubscription(id: String, subscription: (Activity) -> Unit) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnRestartSubscription(wrappedSubscription)
    }

    fun addOnPreCreateSubscription(id: String, subscription: (Activity, Bundle?) -> Unit) {
        val wrappedSubscription: (Activity, Bundle?) -> Unit = { activity, bundle ->
            if (isIdMatch(activity, id)) {
                subscription(activity, bundle)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPreCreateSubscription(wrappedSubscription)
    }


    fun addOnPreStartSubscription(id: String, subscription: (Activity) -> Unit) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPreStartSubscription(wrappedSubscription)
    }

    fun addOnPreResumeSubscription(id: String, subscription: (Activity) -> Unit) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPreResumeSubscription(wrappedSubscription)
    }

    fun addOnPrePauseSubscription(id: String, subscription: (Activity) -> Unit) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPrePauseSubscription(wrappedSubscription)
    }

    fun addOnPreStopSubscription(id: String, subscription: (Activity) -> Unit) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPreStopSubscription(wrappedSubscription)
    }

    fun addOnPreDestroySubscription(id: String, subscription: (Activity) -> Unit) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPreDestroySubscription(wrappedSubscription)
    }

    fun addOnPostCreateSubscription(id: String, subscription: (Activity, Bundle?) -> Unit) {
        val wrappedSubscription: (Activity, Bundle?) -> Unit = { activity, bundle ->
            if (isIdMatch(activity, id)) {
                subscription(activity, bundle)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPostCreateSubscription(wrappedSubscription)
    }


    fun addOnPostStartSubscription(id: String, subscription: (Activity) -> Unit) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPostStartSubscription(wrappedSubscription)
    }

    fun addOnPostResumeSubscription(id: String, subscription: (Activity) -> Unit) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPostResumeSubscription(wrappedSubscription)
    }

    fun addOnPostPauseSubscription(id: String, subscription: (Activity) -> Unit) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPostPauseSubscription(wrappedSubscription)
    }

    fun addOnPostStopSubscription(id: String, subscription: (Activity) -> Unit) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPostStopSubscription(wrappedSubscription)
    }

    fun addOnPostDestroySubscription(id: String, subscription: (Activity) -> Unit) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPostDestroySubscription(wrappedSubscription)
    }

    fun addOnCreateSubscription(id: String, subscription: (Activity, Bundle?) -> Unit) {
        val wrappedSubscription: (Activity, Bundle?) -> Unit = { activity, bundle ->
            if (isIdMatch(activity, id)) {
                subscription(activity, bundle)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnCreateSubscription(wrappedSubscription)
    }


    fun addOnStartSubscription(id: String, subscription: (Activity) -> Unit) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnStartSubscription(wrappedSubscription)
    }

    fun addOnResumeSubscription(id: String, subscription: (Activity) -> Unit) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnResumeSubscription(wrappedSubscription)
    }

    fun addOnPauseSubscription(id: String, subscription: (Activity) -> Unit) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPauseSubscription(wrappedSubscription)
    }

    fun addOnStopSubscription(id: String, subscription: (Activity) -> Unit) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnStopSubscription(wrappedSubscription)
    }

    fun addOnDestroySubscription(id: String, subscription: (Activity) -> Unit) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnDestroySubscription(wrappedSubscription)
    }

    fun addOnSaveInstanceStateSubscription(id: String, subscription: (Activity, Bundle) -> Unit) {
        val wrappedSubscription: (Activity, Bundle) -> Unit = { activity, bundle ->
            if (isIdMatch(activity, id)) {
                subscription(activity, bundle)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnSaveInstanceStateSubscription(wrappedSubscription)
    }

    private fun isIdMatch(activity: Activity, id: String): Boolean {
        return id == FacadeIntentManager.getId(activity)
    }


    fun addOnRestartSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnRestartSubscription(wrappedSubscription)
    }
    fun addOnPreCreateSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity, Bundle?) -> Unit
    ) {
        val wrappedSubscription: (Activity, Bundle?) -> Unit = { activity, bundle ->
            if (isActivityClassMatch(activity, activityClass)) {
                subscription(activity, bundle)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPreCreateSubscription(wrappedSubscription)
    }

    fun addOnPreStartSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPreStartSubscription(wrappedSubscription)
    }

    fun addOnPreResumeSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPreResumeSubscription(wrappedSubscription)
    }

    fun addOnPrePauseSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPrePauseSubscription(wrappedSubscription)
    }

    fun addOnPreStopSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPreStopSubscription(wrappedSubscription)
    }

    fun addOnPreDestroySubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPreDestroySubscription(wrappedSubscription)
    }

    fun addOnPostCreateSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity, Bundle?) -> Unit
    ) {
        val wrappedSubscription: (Activity, Bundle?) -> Unit = { activity, bundle ->
            if (isActivityClassMatch(activity, activityClass)) {
                subscription(activity, bundle)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPostCreateSubscription(wrappedSubscription)
    }

    fun addOnPostStartSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPostStartSubscription(wrappedSubscription)
    }

    fun addOnPostResumeSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPostResumeSubscription(wrappedSubscription)
    }

    fun addOnPostPauseSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPostPauseSubscription(wrappedSubscription)
    }

    fun addOnPostStopSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPostStopSubscription(wrappedSubscription)
    }

    fun addOnPostDestroySubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPostDestroySubscription(wrappedSubscription)
    }

    fun addOnCreateSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity, Bundle?) -> Unit
    ) {
        val wrappedSubscription: (Activity, Bundle?) -> Unit = { activity, bundle ->
            if (isActivityClassMatch(activity, activityClass)) {
                subscription(activity, bundle)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnCreateSubscription(wrappedSubscription)
    }

    fun addOnStartSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnStartSubscription(wrappedSubscription)
    }

    fun addOnResumeSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnResumeSubscription(wrappedSubscription)
    }

    fun addOnPauseSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPauseSubscription(wrappedSubscription)
    }

    fun addOnStopSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnStopSubscription(wrappedSubscription)
    }

    fun addOnDestroySubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnDestroySubscription(wrappedSubscription)
    }

    fun addOnSaveInstanceStateSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity, Bundle) -> Unit
    ) {
        val wrappedSubscription: (Activity, Bundle) -> Unit = { activity, bundle ->
            if (isActivityClassMatch(activity, activityClass)) {
                subscription(activity, bundle)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnSaveInstanceStateSubscription(wrappedSubscription)
    }

    private fun isActivityClassMatch(
        activity: Activity,
        activityClass: Class<out Activity>
    ): Boolean {
        return activity.javaClass == activityClass
    }

    fun addOnRestartSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass) && isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnRestartSubscription(wrappedSubscription)
    }
    fun addOnPreCreateSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity, Bundle?) -> Unit
    ) {
        val wrappedSubscription: (Activity, Bundle?) -> Unit = { activity, bundle ->
            if (isActivityClassMatch(activity, activityClass) && isIdMatch(activity, id)) {
                subscription(activity, bundle)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPreCreateSubscription(wrappedSubscription)
    }


    fun addOnPreStartSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass) && isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPreStartSubscription(wrappedSubscription)
    }

    fun addOnPreResumeSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass) && isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPreResumeSubscription(wrappedSubscription)
    }

    fun addOnPrePauseSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass) && isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPrePauseSubscription(wrappedSubscription)
    }

    fun addOnPreStopSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass) && isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPreStopSubscription(wrappedSubscription)
    }

    fun addOnPreDestroySubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass) && isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPreDestroySubscription(wrappedSubscription)
    }

    fun addOnPostCreateSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity, Bundle?) -> Unit
    ) {
        val wrappedSubscription: (Activity, Bundle?) -> Unit = { activity, bundle ->
            if (isActivityClassMatch(activity, activityClass) && isIdMatch(activity, id)) {
                subscription(activity, bundle)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPostCreateSubscription(wrappedSubscription)
    }


    fun addOnPostStartSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass) && isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPostStartSubscription(wrappedSubscription)
    }

    fun addOnPostResumeSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass) && isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPostResumeSubscription(wrappedSubscription)
    }

    fun addOnPostPauseSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass) && isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPostPauseSubscription(wrappedSubscription)
    }

    fun addOnPostStopSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass) && isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPostStopSubscription(wrappedSubscription)
    }

    fun addOnPostDestroySubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass) && isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPostDestroySubscription(wrappedSubscription)
    }

    fun addOnCreateSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity, Bundle?) -> Unit
    ) {
        val wrappedSubscription: (Activity, Bundle?) -> Unit = { activity, bundle ->
            if (isActivityClassMatch(activity, activityClass) && isIdMatch(activity, id)) {
                subscription(activity, bundle)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnCreateSubscription(wrappedSubscription)
    }


    fun addOnStartSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass) && isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnStartSubscription(wrappedSubscription)
    }

    fun addOnResumeSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass) && isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnResumeSubscription(wrappedSubscription)
    }

    fun addOnPauseSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass) && isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnPauseSubscription(wrappedSubscription)
    }

    fun addOnStopSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass) && isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnStopSubscription(wrappedSubscription)
    }

    fun addOnDestroySubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isActivityClassMatch(activity, activityClass) && isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnDestroySubscription(wrappedSubscription)
    }

    fun addOnSaveInstanceStateSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity, Bundle) -> Unit
    ) {
        val wrappedSubscription: (Activity, Bundle) -> Unit = { activity, bundle ->
            if (isActivityClassMatch(activity, activityClass) && isIdMatch(activity, id)) {
                subscription(activity, bundle)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnSaveInstanceStateSubscription(wrappedSubscription)
    }
}