package software.galaniberico.moduledroid.facade

import android.app.Activity
import android.os.Bundle
import software.galaniberico.moduledroid.subcomponents.activitylifecycle.ActivitiesData
import software.galaniberico.moduledroid.subcomponents.activitylifecycle.ActivityLifecycleSubscriptionManager

object FacadeActivityLifecycle {
    fun getCurrentActivity(): Activity? {
        return ActivitiesData.getCurrentActivity()
    }

    fun getCurrentActivityOrFail(): Activity {
        return ActivitiesData.getCurrentActivity()
            ?: throw IllegalStateException("There is not an activity resumed or active. Maybe are you trying to access the activity before is resumed?")
    }

    fun addOnCreateSubscription(subscription: (Activity, Bundle?) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnCreateSubscription(subscription)
    }

    fun addOnRestartSubscription(subscription: (Activity) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnRestartSubscription(subscription)
    }

    fun addOnStartSubscription(subscription: (Activity) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnStartSubscription(subscription)
    }

    fun addOnResumeSubscription(subscription: (Activity) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnResumeSubscription(subscription)
    }

    fun addOnPauseSubscription(subscription: (Activity) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnPauseSubscription(subscription)
    }

    fun addOnStopSubscription(subscription: (Activity) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnStopSubscription(subscription)
    }

    fun addOnDestroySubscription(subscription: (Activity) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnDestroySubscription(subscription)
    }

    fun addOnSaveInstanceStateSubscription(subscription: (Activity, Bundle) -> Unit) {
        ActivityLifecycleSubscriptionManager.addOnSaveInstanceStateSubscription(subscription)
    }

    fun addOnCreateSubscription(id: String, subscription: (Activity, Bundle?) -> Unit) {
        val wrappedSubscription: (Activity, Bundle?) -> Unit = { activity, bundle ->
            if (isIdMatch(activity, id)) {
                subscription(activity, bundle)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnCreateSubscription(wrappedSubscription)
    }

    fun addOnRestartSubscription(id: String, subscription: (Activity) -> Unit) {
        val wrappedSubscription: (Activity) -> Unit = { activity ->
            if (isIdMatch(activity, id)) {
                subscription(activity)
            }
        }
        ActivityLifecycleSubscriptionManager.addOnRestartSubscription(wrappedSubscription)
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
        return id == activity.intent.getStringExtra(FacadeIntentManager.getIdKey())
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