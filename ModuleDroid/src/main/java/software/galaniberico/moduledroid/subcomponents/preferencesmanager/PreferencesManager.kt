package software.galaniberico.moduledroid.subcomponents.preferencesmanager

import android.content.SharedPreferences

internal object PreferencesManager {
    internal var preferences: SharedPreferences? = null

    internal fun get(key: String, defaultValue: String) : String{
        return preferences?.getString(key, defaultValue) ?: defaultValue
    }

    internal fun get(key: String, defaultValue: Int) : Int{
        return preferences?.getInt(key, defaultValue) ?: defaultValue
    }

    internal fun get(key: String, defaultValue: Long) : Long{
        return preferences?.getLong(key, defaultValue) ?: defaultValue
    }

    internal fun get(key: String, defaultValue: Float) : Float{
        return preferences?.getFloat(key, defaultValue) ?: defaultValue
    }

    internal fun get(key: String, defaultValue: Boolean) : Boolean{
        return preferences?.getBoolean(key, defaultValue) ?: defaultValue
    }

    internal fun get(key: String, defaultValue: Set<String>) : Set<String>{
        return preferences?.getStringSet(key, defaultValue) ?: defaultValue
    }

    internal fun set(key: String, value: String) {
        val editor: SharedPreferences.Editor = preferences?.edit() ?: throw IllegalStateException("Attempting to put values into null preferences. Maybe the plugin is not correctly configured?")
        editor.putString(key, value)
        editor.apply()
    }

    internal fun set(key: String, value: Int){
        val editor: SharedPreferences.Editor = preferences?.edit() ?: throw IllegalStateException("Attempting to put values into null preferences. Maybe the plugin is not correctly configured?")
        editor.putInt(key, value)
        editor.apply()
    }

    internal fun set(key: String, value: Long){
        val editor: SharedPreferences.Editor = preferences?.edit() ?: throw IllegalStateException("Attempting to put values into null preferences. Maybe the plugin is not correctly configured?")
        editor.putLong(key, value)
        editor.apply()
    }

    internal fun set(key: String, value: Float){
        val editor: SharedPreferences.Editor = preferences?.edit() ?: throw IllegalStateException("Attempting to put values into null preferences. Maybe the plugin is not correctly configured?")
        editor.putFloat(key, value)
        editor.apply()
    }

    internal fun set(key: String, value: Boolean){
        val editor: SharedPreferences.Editor = preferences?.edit() ?: throw IllegalStateException("Attempting to put values into null preferences. Maybe the plugin is not correctly configured?")
        editor.putBoolean(key, value)
        editor.apply()
    }

    internal fun set(key: String, value: Set<String>){
        val editor: SharedPreferences.Editor = preferences?.edit() ?: throw IllegalStateException("Attempting to put values into null preferences. Maybe the plugin is not correctly configured?")
        editor.putStringSet(key, value)
        editor.apply()
    }

    internal fun clear(){
        val editor: SharedPreferences.Editor = preferences?.edit() ?: throw IllegalStateException("Attempting to put values into null preferences. Maybe the plugin is not correctly configured?")
        editor.clear()
        editor.apply()
    }

    internal fun clearForce(){ //Remove all keys
        val editor: SharedPreferences.Editor = preferences?.edit() ?: throw IllegalStateException("Attempting to put values into null preferences. Maybe the plugin is not correctly configured?")
        for (k in preferences?.all?.keys ?: emptySet<String>()){
            editor.remove(k)
        }
        editor.apply()
    }

    internal fun addSubscription(lambda:(SharedPreferences, String?) -> Unit){
        preferences?.registerOnSharedPreferenceChangeListener(lambda)
    }

    internal fun removeSubscription(lambda:(SharedPreferences, String?) -> Unit){
        preferences?.unregisterOnSharedPreferenceChangeListener(lambda)
    }


}