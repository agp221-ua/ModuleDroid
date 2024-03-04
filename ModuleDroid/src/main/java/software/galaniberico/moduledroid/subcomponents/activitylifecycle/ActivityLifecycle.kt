package software.galaniberico.moduledroid.subcomponents.activitylifecycle

import software.galaniberico.moduledroid.subcomponents.kernelconfigurator.AppConfigurator
import software.galaniberico.moduledroid.subcomponents.kernelconfigurator.ModuleDroidApplication

object ActivityLifecycle : AppConfigurator {
    override fun onApplicationCreate(app: ModuleDroidApplication) {
        app.registerActivityLifecycleCallbacks(MDActivityLifecycleCallbacks())
    }
}