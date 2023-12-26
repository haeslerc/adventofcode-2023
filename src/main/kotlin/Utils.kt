import java.io.File

fun readFile(path: String) = File("src/inputs", "$path.txt").readLines()