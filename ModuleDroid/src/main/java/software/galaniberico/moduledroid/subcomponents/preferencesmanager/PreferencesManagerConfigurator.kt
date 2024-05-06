package software.galaniberico.moduledroid.subcomponents.preferencesmanager

import android.content.Context
import software.galaniberico.moduledroid.subcomponents.kernelconfigurator.AppConfigurator
import software.galaniberico.moduledroid.subcomponents.kernelconfigurator.ModuleDroidApplication

internal object PreferencesManagerConfigurator : AppConfigurator {
    override fun onApplicationCreate(app: ModuleDroidApplication) {
        PreferencesManager.preferences = app.getSharedPreferences("###ModuleDroid_PreferencesManager@PREFERENCE_NAME###", Context.MODE_PRIVATE);
    }
}