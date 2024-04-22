package software.galaniberico.moduledroid.classes

import android.app.Application
import software.galaniberico.moduledroid.MainActivity
import software.galaniberico.moduledroid.subcomponents.kernelconfigurator.PluginConfigurator

class PluginTest : PluginConfigurator {
    override fun configure(app: Application) {
        MainActivity.pluginOk = true
    }
}