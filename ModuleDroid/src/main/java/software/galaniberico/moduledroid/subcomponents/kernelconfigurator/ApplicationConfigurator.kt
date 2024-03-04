package software.galaniberico.moduledroid.subcomponents.kernelconfigurator

import software.galaniberico.moduledroid.subcomponents.activitylifecycle.ActivityLifecycle

/**
 * This class is responsible of implementing all necessary methods to correctly configure the
 * *ModuleDroidApplication*.
 */
object ApplicationConfigurator {
    /**
     * List of subcomponents that need to configure something in the application. They must implement
     * *AppConfigurator* interface.
     */
    private val subcomponents: List<AppConfigurator> = listOf(
        ActivityLifecycle
    )

    /**
     * This method executes all *onApplicationCreate()* methods of all subcomponents in
     * *ApplicationConfigurator.subcomponents*
     */
    fun configure(app: ModuleDroidApplication) {
        subcomponents.forEach {
            it.onApplicationCreate(app)
        }
    }

}

/**
This interface represents a class that configure the Android Application.
 */
interface AppConfigurator {
    /**
     * When the Android application is created, this method is called.
     * The implementing class must be registered in *ApplicationConfigurator.subcomponents* list.
     */
    fun onApplicationCreate(app: ModuleDroidApplication)
}