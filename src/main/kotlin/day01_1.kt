fun main() {
    val input = readFile("day01_1")
    var calibrationValue = 0
    input.forEach {
        val firstVal = it.first { i -> i in '0'..'9' }
        val lastVal = it.last { i -> i in '0'..'9' }
        calibrationValue += ("$firstVal$lastVal").toInt()
    }
    println(calibrationValue)
}