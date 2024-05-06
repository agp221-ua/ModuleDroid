package software.galaniberico.moduledroid.subcomponents.preferencesmanager

import android.content.Context
import androidx.preference.PreferenceManager
import software.galaniberico.moduledroid.subcomponents.kernelconfigurator.AppConfigurator
import software.galaniberico.moduledroid.subcomponents.kernelconfigurator.ModuleDroidApplication

private const val PREFERENCES_FILENAME = "###ModuleDroid_PreferencesManager@PREFERENCE_NAME###"

internal object PreferencesManagerConfigurator : AppConfigurator {
    override fun onApplicationCreate(app: ModuleDroidApplication) {
        PreferencesManager.preferences = app.getSharedPreferences(PREFERENCES_FILENAME, Context.MODE_PRIVATE);
    }
}