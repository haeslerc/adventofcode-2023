fun main() {
    val input = readFile("day01_1")
    var calibrationValue = 0
    input.forEach { s ->
        val (firstVal, lastVal) = s.filter { it.isDigit() }.run { first() to last() }
        calibrationValue += ("$firstVal$lastVal").toInt()}
    println(calibrationValue)
}