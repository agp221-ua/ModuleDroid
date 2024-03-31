package software.galaniberico.moduledroid.subcomponents.kernelconfigurator

import android.app.Application

open class ModuleDroidApplication : Application() {
        override fun onCreate() {
            super.onCreate()

            ApplicationConfigurator.configure(this)



        }
}