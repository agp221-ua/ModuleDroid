package software.galaniberico.moduledroid.subcomponents.kernelconfigurator

import android.app.Application
import android.content.pm.PackageManager
import android.health.connect.datatypes.AppInfo
import android.os.Bundle
import android.text.TextUtils.split
import software.galaniberico.moduledroid.subcomponents.activitylifecycle.ActivityLifecycleConfigurator
import software.galaniberico.moduledroid.subcomponents.preferencesmanager.PreferencesManagerConfigurator
import java.io.InvalidClassException

/**
 * This class is responsible of implementing all necessary methods to correctly configure the
 * *ModuleDroidApplication*.
 */
internal object ApplicationConfigurator {
    /**
     * List of subcomponents that need to configure something in the application. They must implement
     * *AppConfigurator* interface.
     */
    private val subcomponents: List<AppConfigurator> = listOf(
        ActivityLifecycleConfigurator,
        PreferencesManagerConfigurator
    )

    /**
     * This method executes all *onApplicationCreate()* methods of all subcomponents in
     * *ApplicationConfigurator.subcomponents*
     */
    fun configure(app: ModuleDroidApplication) {
        subcomponents.forEach {
            it.onApplicationCreate(app)
        }
        setUpPlugins(app)
    }

    fun setUpPlugins(app: ModuleDroidApplication) {
        getConfigurablePlugins(app)
    }

    private fun getConfigurablePlugins(app: ModuleDroidApplication) {
        val stringArray = getMetaDataString("moduledroid_plugins", app)
        for (s in stringArray)
            try {
                val pluginClass = Class.forName(s)
                if (PluginConfigurator::class.java.isAssignableFrom(pluginClass)) {
                    val pluginInstance = pluginClass
                        .getDeclaredConstructor().newInstance() as PluginConfigurator

                    pluginInstance.configure(app)
                } else {
                    throw UnsupportedOperationException("The class $s does not implement the ModuleDroid interface called 'PluginConfigurator'. Have you written the class path correctly? Maybe it is not the class you should add in 'moduledroid_plugins' section")
                }
            } catch (e: ClassNotFoundException) {
                throw ClassNotFoundException("The class $s can not be found. Have you written the class path correctly? Maybe have you not imported correctly the library?")
            } catch (e: InstantiationException) {
                throw InstantiationException("The class $s could not be instantiated. Revise the plugin's library import. If the problem persists, try contacting the plugin author")
            } catch (e: IllegalAccessException) {
                throw IllegalAccessException("The class $s could not be accessed. Revise the plugin's library import. If the problem persists, try contacting the plugin author")
            }
    }

    private fun getMetaDataString(key: String, app: ModuleDroidApplication): List<String> {
        return try {
            val appInfo = app.packageManager
                .getApplicationInfo(app.packageName, PackageManager.GET_META_DATA)
            val plugins: List<String>? = appInfo.metaData?.getString(key)?.split(",")
                ?.map { it.trim().removeSurrounding("\n") }

            plugins ?: emptyList()
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
            emptyList()
        }
    }
}

/**
This interface represents a class that configure the Android Application.
 */
internal interface AppConfigurator {
    /**
     * When the Android application is created, this method is called.
     * The implementing class must be registered in *ApplicationConfigurator.subcomponents* list.
     */
    fun onApplicationCreate(app: ModuleDroidApplication)
}

interface PluginConfigurator {
    fun configure(app: Application)
}