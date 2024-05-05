package software.galaniberico.moduledroid.facade

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import software.galaniberico.moduledroid.subcomponents.intentmanager.LocalIntentManager

object Facade {

    // ### ACTIVITY LIFECYCLE ###

    fun getCurrentActivity(): Activity? {
        return FacadeActivityLifecycle.getCurrentActivity()
    }

    fun getCurrentActivityOrFail(): Activity {
        return FacadeActivityLifecycle.getCurrentActivityOrFail()
    }

    fun getPreferredActivity(): Activity? {
        return FacadeActivityLifecycle.getPreferredActivity()
    }

    fun getPreferredActivityOrFail(): Activity {
        return FacadeActivityLifecycle.getPreferredActivityOrFail()
    }

    fun getCreatingActivity(): Activity? {
        return FacadeActivityLifecycle.getCreatingActivity()
    }

    fun getCreatingActivityOrFail(): Activity {
        return FacadeActivityLifecycle.getCreatingActivityOrFail()
    }

    fun getStartingActivity(): Activity? {
        return FacadeActivityLifecycle.getStartingActivity()
    }

    fun getStartingActivityOrFail(): Activity {
        return FacadeActivityLifecycle.getStartingActivityOrFail()
    }

    fun getResumingActivity(): Activity? {
        return FacadeActivityLifecycle.getResumingActivity()
    }

    fun getResumingActivityOrFail(): Activity {
        return FacadeActivityLifecycle.getResumingActivityOrFail()
    }
    fun addOnRestartSubscription(subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnRestartSubscription(subscription)
    }

    fun addOnPreCreateSubscription(subscription: (Activity, Bundle?) -> Unit) {
        FacadeActivityLifecycle.addOnPreCreateSubscription(subscription)
    }

    fun addOnPreStartSubscription(subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnPreStartSubscription(subscription)
    }

    fun addOnPreResumeSubscription(subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnPreResumeSubscription(subscription)
    }

    fun addOnPrePauseSubscription(subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnPrePauseSubscription(subscription)
    }

    fun addOnPreStopSubscription(subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnPreStopSubscription(subscription)
    }

    fun addOnPreDestroySubscription(subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnPreDestroySubscription(subscription)
    }

    fun addOnPostCreateSubscription(subscription: (Activity, Bundle?) -> Unit) {
        FacadeActivityLifecycle.addOnPostCreateSubscription(subscription)
    }

    fun addOnPostStartSubscription(subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnPostStartSubscription(subscription)
    }

    fun addOnPostResumeSubscription(subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnPostResumeSubscription(subscription)
    }

    fun addOnPostPauseSubscription(subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnPostPauseSubscription(subscription)
    }

    fun addOnPostStopSubscription(subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnPostStopSubscription(subscription)
    }

    fun addOnPostDestroySubscription(subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnPostDestroySubscription(subscription)
    }

    fun addOnCreateSubscription(subscription: (Activity, Bundle?) -> Unit) {
        FacadeActivityLifecycle.addOnCreateSubscription(subscription)
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
    fun addOnRestartSubscription(id: String, subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnRestartSubscription(id, subscription)
    }

    fun addOnCreateSubscription(id: String, subscription: (Activity, Bundle?) -> Unit) {
        FacadeActivityLifecycle.addOnCreateSubscription(id, subscription)
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

    fun addOnPreCreateSubscription(id: String, subscription: (Activity, Bundle?) -> Unit) {
        FacadeActivityLifecycle.addOnPreCreateSubscription(id, subscription)
    }


    fun addOnPreStartSubscription(id: String, subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnPreStartSubscription(id, subscription)
    }

    fun addOnPreResumeSubscription(id: String, subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnPreResumeSubscription(id, subscription)
    }

    fun addOnPrePauseSubscription(id: String, subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnPrePauseSubscription(id, subscription)
    }

    fun addOnPreStopSubscription(id: String, subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnPreStopSubscription(id, subscription)
    }

    fun addOnPreDestroySubscription(id: String, subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnPreDestroySubscription(id, subscription)
    }

    fun addOnPostCreateSubscription(id: String, subscription: (Activity, Bundle?) -> Unit) {
        FacadeActivityLifecycle.addOnPostCreateSubscription(id, subscription)
    }


    fun addOnPostStartSubscription(id: String, subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnPostStartSubscription(id, subscription)
    }

    fun addOnPostResumeSubscription(id: String, subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnPostResumeSubscription(id, subscription)
    }

    fun addOnPostPauseSubscription(id: String, subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnPostPauseSubscription(id, subscription)
    }

    fun addOnPostStopSubscription(id: String, subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnPostStopSubscription(id, subscription)
    }

    fun addOnPostDestroySubscription(id: String, subscription: (Activity) -> Unit) {
        FacadeActivityLifecycle.addOnPostDestroySubscription(id, subscription)
    }

    fun addOnSaveInstanceStateSubscription(id: String, subscription: (Activity, Bundle) -> Unit) {
        FacadeActivityLifecycle.addOnSaveInstanceStateSubscription(id, subscription)
    }

    fun addOnRestartSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnRestartSubscription(activityClass, subscription)
    }
    fun addOnCreateSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity, Bundle?) -> Unit
    ) {
        FacadeActivityLifecycle.addOnCreateSubscription(activityClass, subscription)
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

    fun addOnPreCreateSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity, Bundle?) -> Unit
    ) {
        FacadeActivityLifecycle.addOnPreCreateSubscription(activityClass, subscription)
    }


    fun addOnPreStartSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnPreStartSubscription(activityClass, subscription)
    }

    fun addOnPreResumeSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnPreResumeSubscription(activityClass, subscription)
    }

    fun addOnPrePauseSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnPrePauseSubscription(activityClass, subscription)
    }

    fun addOnPreStopSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnPreStopSubscription(activityClass, subscription)
    }

    fun addOnPreDestroySubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnPreDestroySubscription(activityClass, subscription)
    }

    fun addOnPostCreateSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity, Bundle?) -> Unit
    ) {
        FacadeActivityLifecycle.addOnPostCreateSubscription(activityClass, subscription)
    }


    fun addOnPostStartSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnPostStartSubscription(activityClass, subscription)
    }

    fun addOnPostResumeSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnPostResumeSubscription(activityClass, subscription)
    }

    fun addOnPostPauseSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnPostPauseSubscription(activityClass, subscription)
    }

    fun addOnPostStopSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnPostStopSubscription(activityClass, subscription)
    }

    fun addOnPostDestroySubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnPostDestroySubscription(activityClass, subscription)
    }

    fun addOnSaveInstanceStateSubscription(
        activityClass: Class<out Activity>,
        subscription: (Activity, Bundle) -> Unit
    ) {
        FacadeActivityLifecycle.addOnSaveInstanceStateSubscription(activityClass, subscription)
    }

    fun addOnRestartSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnRestartSubscription(id, activityClass, subscription)
    }
    fun addOnCreateSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity, Bundle?) -> Unit
    ) {
        FacadeActivityLifecycle.addOnCreateSubscription(id, activityClass, subscription)
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

    fun addOnPreCreateSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity, Bundle?) -> Unit
    ) {
        FacadeActivityLifecycle.addOnPreCreateSubscription(id, activityClass, subscription)
    }


    fun addOnPreStartSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnPreStartSubscription(id, activityClass, subscription)
    }

    fun addOnPreResumeSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnPreResumeSubscription(id, activityClass, subscription)
    }

    fun addOnPrePauseSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnPrePauseSubscription(id, activityClass, subscription)
    }

    fun addOnPreStopSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnPreStopSubscription(id, activityClass, subscription)
    }

    fun addOnPreDestroySubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnPreDestroySubscription(id, activityClass, subscription)
    }

    fun addOnPostCreateSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity, Bundle?) -> Unit
    ) {
        FacadeActivityLifecycle.addOnPostCreateSubscription(id, activityClass, subscription)
    }


    fun addOnPostStartSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnPostStartSubscription(id, activityClass, subscription)
    }

    fun addOnPostResumeSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnPostResumeSubscription(id, activityClass, subscription)
    }

    fun addOnPostPauseSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnPostPauseSubscription(id, activityClass, subscription)
    }

    fun addOnPostStopSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnPostStopSubscription(id, activityClass, subscription)
    }

    fun addOnPostDestroySubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity) -> Unit
    ) {
        FacadeActivityLifecycle.addOnPostDestroySubscription(id, activityClass, subscription)
    }

    fun addOnSaveInstanceStateSubscription(
        id: String,
        activityClass: Class<out Activity>,
        subscription: (Activity, Bundle) -> Unit
    ) {
        FacadeActivityLifecycle.addOnSaveInstanceStateSubscription(id, activityClass, subscription)
    }

    // ### INTENT MANAGER ###

    fun startActivity(target: Class<out Activity>, id: String? = null, preaction: (intent: Intent , id: String, internalId: String) -> Unit = {_,_,_ -> }): String {
        return FacadeIntentManager.startActivity(target, id, preaction)
    }

    fun startActivityForResult(target: Class<out Activity>, requestCode: Int? = null, id: String? = null, preaction: (intent: Intent, id: String, internalId: String) -> Unit = {_,_,_ -> }): Pair<String, Int>{
        return FacadeIntentManager.startActivityForResult(target, id, requestCode, preaction)
    }

    fun startActivity(activity: Activity, target: Class<out Activity>, id: String? = null, preaction: (intent: Intent, id: String, internalId: String) -> Unit = {_,_,_ -> }): String {
        return FacadeIntentManager.startActivity(activity, target, id, preaction)
    }

    fun startActivityForResult(activity: Activity, target: Class<out Activity>, requestCode: Int? = null, id: String? = null, preaction: (intent: Intent, id: String, internalId: String) -> Unit = {_,_,_ -> }): Pair<String, Int>{
        return FacadeIntentManager.startActivityForResult(activity, target, id, requestCode, preaction)
    }

    fun provideId(activity: Activity) : String {
        return FacadeIntentManager.provideId(activity)
    }

    fun getId(activity: Activity) : String? {
        return FacadeIntentManager.getId(activity)
    }
    fun getInternalId(activity: Activity) : String {
        return FacadeIntentManager.getInternalId(activity)
    }

    fun getIdOrProvideOne(activity: Activity) : String {
        return FacadeIntentManager.getIdOrProvideOne(activity)
    }
}