package lesson_16

private const val API_KEY : String = "vnhkvvuenqkdjndfjieswkd"

class SomeClass {
    private var state: String = "Loading..."
    private val support: SomeSupportClass = SomeSupportClass()

    fun onLoad() {
        setState("Loaded")
        support.format("Loaded")
    }

    fun onStart() {
        setState("Loading...")
        support.format("Loading...")
    }

    fun onFail() {
        setState("Fail")
        support.format("Fail")
    }

    fun getState() = state
    fun setState(newState: String) {
        state = newState
    }
}

private class SomeSupportClass {
    fun format(value: String) {
        println("You changed state to $value")
    }
}