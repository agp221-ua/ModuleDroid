package software.galaniberico.moduledroid.subcomponents.activitylifecycle

import android.app.Activity
import android.os.Bundle

/**
 * Manages subscriptions to various lifecycle events of Android activities.
 */
object ActivityLifecycleSubscriptionManager {

    internal val onCreateSuscriptions = mutableListOf<(Activity, Bundle?) -> Unit>()

    internal val onRestartSuscriptions = mutableListOf<(Activity) -> Unit>()

    internal val onStartSuscriptions = mutableListOf<(Activity) -> Unit>()

    internal val onResumeSuscriptions = mutableListOf<(Activity) -> Unit>()

    internal val onPauseSuscriptions = mutableListOf<(Activity) -> Unit>()

    internal val onStopSuscriptions = mutableListOf<(Activity) -> Unit>()

    internal val onDestroySuscriptions = mutableListOf<(Activity) -> Unit>()

    internal val onSaveInstanceStateSuscriptions = mutableListOf<(Activity, Bundle) -> Unit>()

    /**
     * Adds a subscription for the `onCreate` lifecycle event of an activity.
     * @param subscription Lambda expression or function to be executed on `onCreate`.
     */
    fun addOnCreateSubscription(subscription: (Activity, Bundle?) -> Unit) {
        onCreateSuscriptions.add(subscription)
    }

    /**
     * Adds a subscription for the `onRestart` lifecycle event of an activity.
     * @param subscription Lambda expression or function to be executed on `onRestart`.
     */
    fun addOnRestartSubscription(subscription: (Activity) -> Unit) {
        onRestartSuscriptions.add(subscription)
    }

    /**
     * Adds a subscription for the `onStart` lifecycle event of an activity.
     * @param subscription Lambda expression or function to be executed on `onStart`.
     */
    fun addOnStartSubscription(subscription: (Activity) -> Unit) {
        onStartSuscriptions.add(subscription)
    }

    /**
     * Adds a subscription for the `onResume` lifecycle event of an activity.
     * @param subscription Lambda expression or function to be executed on `onResume`.
     */
    fun addOnResumeSubscription(subscription: (Activity) -> Unit) {
        onResumeSuscriptions.add(subscription)
    }

    /**
     * Adds a subscription for the `onPause` lifecycle event of an activity.
     * @param subscription Lambda expression or function to be executed on `onPause`.
     */
    fun addOnPauseSubscription(subscription: (Activity) -> Unit) {
        onPauseSuscriptions.add(subscription)
    }

    /**
     * Adds a subscription for the `onStop` lifecycle event of an activity.
     * @param subscription Lambda expression or function to be executed on `onStop`.
     */
    fun addOnStopSubscription(subscription: (Activity) -> Unit) {
        onStopSuscriptions.add(subscription)
    }

    /**
     * Adds a subscription for the `onDestroy` lifecycle event of an activity.
     * @param subscription Lambda expression or function to be executed on `onDestroy`.
     */
    fun addOnDestroySubscription(subscription: (Activity) -> Unit) {
        onDestroySuscriptions.add(subscription)
    }

    /**
     * Adds a subscription for the `onSaveInstanceState` lifecycle event of an activity.
     * @param subscription Lambda expression or function to be executed on `onSaveInstanceState`.
     */
    fun addOnSaveInstanceStateSubscription(subscription: (Activity, Bundle) -> Unit) {
        onSaveInstanceStateSuscriptions.add(subscription)
    }

    //TODO add unsuscription method?

    //TODO add filtering values in this methods or in the subscription? such as id, activity class, ...
    //      maybe with sth like a proxy that encapsulate the subscription and only executed it if
    //      requisites are met.

}
