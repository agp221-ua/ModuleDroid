package software.galaniberico.moduledroid.internalbus

interface InternalBusDataProvider {
    fun <T : Any> getData(key: String): T
}