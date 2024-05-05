package software.galaniberico.moduledroid.subcomponents.activitylifecycle

import software.galaniberico.moduledroid.internalbus.InternalBus
import software.galaniberico.moduledroid.subcomponents.kernelconfigurator.AppConfigurator
import software.galaniberico.moduledroid.subcomponents.kernelconfigurator.ModuleDroidApplication

internal object ActivityLifecycleConfigurator : AppConfigurator {
    override fun onApplicationCreate(app: ModuleDroidApplication) {
        app.registerActivityLifecycleCallbacks(MDActivityLifecycleCallbacks())

        InternalBus.set("CURRENT_ACTIVITY") {
            return@set ActivitiesData.currentActivity
        }
        InternalBus.set("CREATING_ACTIVITY") {
            return@set ActivitiesData.creatingActivity
        }
        InternalBus.set("START_ACTIVITY") {
            return@set ActivitiesData.startingActivity
        }
        InternalBus.set("RESUMING_ACTIVITY") {
            return@set ActivitiesData.resumingActivity
        }
    }
}