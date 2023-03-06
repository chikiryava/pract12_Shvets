import kotlinx.coroutines.*
suspend fun main() = coroutineScope {
    val triangle = Triangle()
    var i:Int = 1
    println("Введите число повторений функции")
    var n: Int = 0
    while (true) {
        try {
            n = readLine()!!.toInt()
            if (n <= 0)
                println("Введите число больше 0")
            else
                break
        }
        catch(e:Exception){
            println("Вы ввели не число")
        }

    }

    while(i<=n){
        launch {
            delay(8000L)
                triangle.TriangleIsIt(triangle.square)
            }
        triangle.GetInfo()
        println("площадь = ${triangle.square}")
        i++
    }
}


