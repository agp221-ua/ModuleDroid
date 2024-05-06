package software.galaniberico.moduledroid.facade

import android.content.SharedPreferences
import software.galaniberico.moduledroid.subcomponents.preferencesmanager.PreferencesManager

internal object FacadePreferencesManager {

    internal fun get(key: String, defaultValue: String) : String{
        return PreferencesManager.get(key, defaultValue)
    }

    internal fun get(key: String, defaultValue: Int) : Int{
        return PreferencesManager.get(key, defaultValue)
    }

    internal fun get(key: String, defaultValue: Long) : Long{
        return PreferencesManager.get(key, defaultValue)
    }

    internal fun get(key: String, defaultValue: Float) : Float{
        return PreferencesManager.get(key, defaultValue)
    }

    internal fun get(key: String, defaultValue: Boolean) : Boolean{
        return PreferencesManager.get(key, defaultValue)
    }

    internal fun get(key: String, defaultValue: Set<String>) : Set<String>{
        return PreferencesManager.get(key, defaultValue)
    }

    internal fun set(key: String, value: String) {
        PreferencesManager.set(key, value)
    }

    internal fun set(key: String, value: Int){
        PreferencesManager.set(key, value)
    }

    internal fun set(key: String, value: Long){
        PreferencesManager.set(key, value)
    }

    internal fun set(key: String, value: Float){
        PreferencesManager.set(key, value)
    }

    internal fun set(key: String, value: Boolean){
        PreferencesManager.set(key, value)
    }

    internal fun set(key: String, value: Set<String>){
        PreferencesManager.set(key, value)
    }

    internal fun clear(){
        PreferencesManager.clear()
    }
    internal fun clearForce(){
        PreferencesManager.clearForce()
    }

    internal fun addSubscription(lambda:(SharedPreferences, String?) -> Unit){
        PreferencesManager.addSubscription(lambda)
    }

    internal fun removeSubscription(lambda:(SharedPreferences, String?) -> Unit){
        PreferencesManager.removeSubscription(lambda)
    }
}