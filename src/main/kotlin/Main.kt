package example.myapp

fun buildAquarium() {
    val myAquarium = Aquarium().also {
        it.printSize()
    }
}

fun main() {
    buildAquarium()
}