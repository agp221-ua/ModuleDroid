package software.galaniberico.moduledroid.util


enum class ErrorMsgTemplate(val string: String, val count: Int){
    /**
     * Return a message when `with()` is called informing that the current activity is null
     * and may ensure that is initialized before.
     * Expect 2 substrings:
     *   - What you are attempting to getting the current activity
     *   - What you are doing
     *
     * The raw message to format:
     *   - "Attempted to %s while the current activity is null. Ensure that the current activity is properly initialized before %s."
     */
    CURRENT_ACTIVITY_NULL_WARNING("Attempted to %s while the current activity is null. Ensure that the current activity is properly initialized before %s.", 2);

    fun with(vararg strings: String): String {
        if (strings.size != count) throw IllegalArgumentException("Exactly $count values are expected as arguments.")
        return String.format(string, *strings)
    }
}