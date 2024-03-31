package software.galaniberico.moduledroid.internalbus

internal object InternalBus {
    val dataProviders = mutableMapOf<String, () -> Any?>()
    inline fun <reified T : Any?> get(id: String): T {
        if (!dataProviders.containsKey(id)) throw NoSuchElementException("InternalBus: The key, ${id}, has no data provider associated. Check if you have set one before accessing it.")
        val data: Any? = dataProviders[id]?.let { it() }
        return data as? T ?: throw ClassCastException("InternalBus: Failed to cast data to the expected type. Actual type: ${data?.javaClass}, Expected type: ${T::class.java}")
    }

    fun set(id: String, foo: () -> Any?){
        if (dataProviders.containsKey(id)) throw IllegalStateException("InternalBus: The key, ${id}, is already in use. Check if you are trying to use that id twice")
        dataProviders[id] = foo
    }
}