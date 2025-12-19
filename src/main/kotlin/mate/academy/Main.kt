package mate.academy

fun greetUsers() {
    while (true) {
        print("Please enter a name (or press Enter to quit):")
        val input = readLine() ?: return
        print("Hello, $input!")
    }
}

fun main() {
    greetUsers()
}
