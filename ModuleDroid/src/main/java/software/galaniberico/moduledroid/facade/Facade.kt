package software.galaniberico.moduledroid.facade

import android.app.Activity
import android.os.Bundle

object Facade {

    // ### ACTIVITY LIFECYCLE ###

    fun getCurrentActivity(): Activity? {
        return FacadeActivityLifecycle.getCurrentActivity()
    }

    fun getCurrentActivityOrFail(): Activity {
        return FacadeActivityLifecycle.getCurrentActivityOrFail()
    }

    fun addOnCreateSubscription(subscription: (Activity, Bundle?) -> Unit) {
        FacadeActivityLifecycle.addOnCreateSubscription(subscription)
    }

    fun addOnRestartSubscription(subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnRestartSubscription(subscription)
    }

    fun addOnStartSubscription(subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnStartSubscription(subscription)
    }

    fun addOnResumeSubscription(subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnResumeSubscription(subscription)
    }

    fun addOnPauseSubscription(subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnPauseSubscription(subscription)
    }

    fun addOnStopSubscription(subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnStopSubscription(subscription)
    }

    fun addOnDestroySubscription(subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnDestroySubscription(subscription)
    }

    fun addOnSaveInstanceStateSubscription(subscription: (Activity, Bundle) -> Unit) {
        FacadeActivityLifecycle.addOnSaveInstanceStateSubscription(subscription)
    }

    fun addOnCreateSubscription(id: String, subscription: (Activity, Bundle?) -> Unit) {
        FacadeActivityLifecycle.addOnCreateSubscription(id, subscription)
    }

    fun addOnRestartSubscription(id: String, subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnRestartSubscription(id, subscription)
    }

    fun addOnStartSubscription(id: String, subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnStartSubscription(id, subscription)
    }

    fun addOnResumeSubscription(id: String, subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnResumeSubscription(id, subscription)
    }

    fun addOnPauseSubscription(id: String, subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnPauseSubscription(id, subscription)
    }

    fun addOnStopSubscription(id: String, subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnStopSubscription(id, subscription)
    }

    fun addOnDestroySubscription(id: String, subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnDestroySubscription(id, subscription)
    }

    fun addOnSaveInstanceStateSubscription(id: String, subscription: (Activity, Bundle) -> Unit) {
        FacadeActivityLifecycle.addOnSaveInstanceStateSubscription(id, subscription)
    }

    fun addOnCreateSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity, Bundle?) -> Unit
    ) {
        FacadeActivityLifecycle.addOnCreateSubscription(activityClass, subscription)
    }

    fun addOnRestartSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnRestartSubscription(activityClass, subscription)
    }

    fun addOnStartSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnStartSubscription(activityClass, subscription)
    }

    fun addOnResumeSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnResumeSubscription(activityClass, subscription)
    }

    fun addOnPauseSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnPauseSubscription(activityClass, subscription)
    }

    fun addOnStopSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnStopSubscription(activityClass, subscription)
    }

    fun addOnDestroySubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnDestroySubscription(activityClass, subscription)
    }

    fun addOnSaveInstanceStateSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity, Bundle) -> Unit
    ) {
        FacadeActivityLifecycle.addOnSaveInstanceStateSubscription(activityClass, subscription)
    }

    fun addOnCreateSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity, Bundle?) -> Unit
    ) {
        FacadeActivityLifecycle.addOnCreateSubscription(id, activityClass, subscription)
    }

    fun addOnRestartSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnRestartSubscription(id, activityClass, subscription)
    }

    fun addOnStartSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnStartSubscription(id, activityClass, subscription)
    }

    fun addOnResumeSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnResumeSubscription(id, activityClass, subscription)
    }

    fun addOnPauseSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnPauseSubscription(id, activityClass, subscription)
    }

    fun addOnStopSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnStopSubscription(id, activityClass, subscription)
    }

    fun addOnDestroySubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnDestroySubscription(id, activityClass, subscription)
    }

    fun addOnSaveInstanceStateSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity, Bundle) -> Unit
    ) {
        FacadeActivityLifecycle.addOnSaveInstanceStateSubscription(id, activityClass, subscription)
    }

    // ### INTENT MANAGER ###

    fun startActivity(target: Class<out Activity>, id: String? = null): String {
        return FacadeIntentManager.startActivity(target, id)
    }

    fun startActivityForResult(target: Class<out Activity>, requestCode: Int? = null, id: String? = null): Pair<String, Int>{
        return FacadeIntentManager.startActivityForResult(target, id, requestCode)
    }

    fun startActivity(activity: Activity, target: Class<out Activity>, id: String? = null): String {
        return FacadeIntentManager.startActivity(activity, target, id)
    }

    fun startActivityForResult(activity: Activity, target: Class<out Activity>, requestCode: Int? = null, id: String? = null): Pair<String, Int>{
        return FacadeIntentManager.startActivityForResult(activity, target, id, requestCode)
    }

    fun getIdKey(): String {
        return FacadeIntentManager.getIdKey()
    }
}