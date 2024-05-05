package software.galaniberico.moduledroid.subcomponents.activitylifecycle

import android.app.Activity
import android.os.Bundle

/**
 * Manages subscriptions to various lifecycle events of Android activities.
 */
internal object ActivityLifecycleSubscriptionManager {

    internal val onPreCreateSuscriptions = mutableListOf<(Activity, Bundle?) -> Unit>()
    internal val onCreateSuscriptions = mutableListOf<(Activity, Bundle?) -> Unit>()
    internal val onPostCreateSuscriptions = mutableListOf<(Activity, Bundle?) -> Unit>()

    internal val onPreStartSuscriptions = mutableListOf<(Activity) -> Unit>()
    internal val onStartSuscriptions = mutableListOf<(Activity) -> Unit>()
    internal val onPostStartSuscriptions = mutableListOf<(Activity) -> Unit>()

    internal val onPreResumeSuscriptions = mutableListOf<(Activity) -> Unit>()
    internal val onResumeSuscriptions = mutableListOf<(Activity) -> Unit>()
    internal val onPostResumeSuscriptions = mutableListOf<(Activity) -> Unit>()

    internal val onPrePauseSuscriptions = mutableListOf<(Activity) -> Unit>()
    internal val onPauseSuscriptions = mutableListOf<(Activity) -> Unit>()
    internal val onPostPauseSuscriptions = mutableListOf<(Activity) -> Unit>()

    internal val onPreStopSuscriptions = mutableListOf<(Activity) -> Unit>()
    internal val onStopSuscriptions = mutableListOf<(Activity) -> Unit>()
    internal val onPostStopSuscriptions = mutableListOf<(Activity) -> Unit>()

    internal val onPreDestroySuscriptions = mutableListOf<(Activity) -> Unit>()
    internal val onDestroySuscriptions = mutableListOf<(Activity) -> Unit>()
    internal val onPostDestroySuscriptions = mutableListOf<(Activity) -> Unit>()



    internal val onRestartSuscriptions = mutableListOf<(Activity) -> Unit>()
    internal val onSaveInstanceStateSuscriptions = mutableListOf<(Activity, Bundle) -> Unit>()

    fun addOnPreCreateSubscription(subscription: (Activity, Bundle?) -> Unit) {
        onPreCreateSuscriptions.add(subscription)
    }

    /**
     * Adds a subscription for the `onCreate` lifecycle event of an activity.
     * @param subscription Lambda expression or function to be executed on `onCreate`.
     */
    fun addOnCreateSubscription(subscription: (Activity, Bundle?) -> Unit) {
        onCreateSuscriptions.add(subscription)
    }

    fun addOnPostCreateSubscription(subscription: (Activity, Bundle?) -> Unit) {
        onPostCreateSuscriptions.add(subscription)
    }


    /**
     * Adds a subscription for the `onRestart` lifecycle event of an activity.
     * @param subscription Lambda expression or function to be executed on `onRestart`.
     */
    fun addOnRestartSubscription(subscription: (Activity) -> Unit) {
        onRestartSuscriptions.add(subscription)
    }

    fun addOnPreStartSubscription(subscription: (Activity) -> Unit) {
        onPreStartSuscriptions.add(subscription)
    }


    /**
     * Adds a subscription for the `onStart` lifecycle event of an activity.
     * @param subscription Lambda expression or function to be executed on `onStart`.
     */
    fun addOnStartSubscription(subscription: (Activity) -> Unit) {
        onStartSuscriptions.add(subscription)
    }

    fun addOnPostStartSubscription(subscription: (Activity) -> Unit) {
        onPostStartSuscriptions.add(subscription)
    }

    fun addOnPreResumeSubscription(subscription: (Activity) -> Unit) {
        onPreResumeSuscriptions.add(subscription)
    }

    /**
     * Adds a subscription for the `onResume` lifecycle event of an activity.
     * @param subscription Lambda expression or function to be executed on `onResume`.
     */
    fun addOnResumeSubscription(subscription: (Activity) -> Unit) {
        onResumeSuscriptions.add(subscription)
    }

    fun addOnPostResumeSubscription(subscription: (Activity) -> Unit) {
        onPostResumeSuscriptions.add(subscription)
    }

    fun addOnPrePauseSubscription(subscription: (Activity) -> Unit) {
        onPrePauseSuscriptions.add(subscription)
    }

    /**
     * Adds a subscription for the `onPause` lifecycle event of an activity.
     * @param subscription Lambda expression or function to be executed on `onPause`.
     */
    fun addOnPauseSubscription(subscription: (Activity) -> Unit) {
        onPauseSuscriptions.add(subscription)
    }

    fun addOnPostPauseSubscription(subscription: (Activity) -> Unit) {
        onPostPauseSuscriptions.add(subscription)
    }

    fun addOnPreStopSubscription(subscription: (Activity) -> Unit) {
        onPreStopSuscriptions.add(subscription)
    }

    /**
     * Adds a subscription for the `onStop` lifecycle event of an activity.
     * @param subscription Lambda expression or function to be executed on `onStop`.
     */
    fun addOnStopSubscription(subscription: (Activity) -> Unit) {
        onStopSuscriptions.add(subscription)
    }

    fun addOnPostStopSubscription(subscription: (Activity) -> Unit) {
        onPostStopSuscriptions.add(subscription)
    }

    fun addOnPreDestroySubscription(subscription: (Activity) -> Unit) {
        onPreDestroySuscriptions.add(subscription)
    }

    /**
     * Adds a subscription for the `onDestroy` lifecycle event of an activity.
     * @param subscription Lambda expression or function to be executed on `onDestroy`.
     */
    fun addOnDestroySubscription(subscription: (Activity) -> Unit) {
        onDestroySuscriptions.add(subscription)
    }

    fun addOnPostDestroySubscription(subscription: (Activity) -> Unit) {
        onPostDestroySuscriptions.add(subscription)
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
