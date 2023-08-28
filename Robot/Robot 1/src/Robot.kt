import java.util.*

object Kotlin {
    @JvmStatic
    fun main(args: Array<String>) {
        val time: Int
        println("Enter scheduled time:")
        val sc = Scanner(System.`in`)
        time = sc.nextInt()
        println(time)
        when (time) {
            8 -> {
                println("Coffee preparation started")
                println("Coffee has been prepared")
            }
            9 -> {
                println("Water heating started")
                println("Water has been boiled")
            }
            10 -> {
                println("Bag packing has been started")
                println("Bag has been packed")
            }
            11 -> {
                println("Lunch preparation has been started")
                println("Lunch has been prepared")
            }
            12 -> {
                println("Iron the cloths")
                println("Iorn of the clothing has been done.")
            }
            else -> if (time < 8) {
                println("Don't worry, you have enough time")
            } else {
                println("Opps!You are very late")
            }
        }
    }
}