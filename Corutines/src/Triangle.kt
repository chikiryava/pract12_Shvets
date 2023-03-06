class Triangle {
    public var square: Double = 0.0
    fun GetInfo(){
        try{
            println("Введите длину основание треугольника")
            val base: Double = readLine()!!.toDouble()
            println("Введите длину высоты треугольника")
            val height:Double = readLine()!!.toDouble()
            val square: Double = (base*height)/2.0
            this.square = square
            println("Высота = ${height}, длина основания = ${base}")
        }
        catch(e:Exception){
            println("Не число")
        }
    }
    fun TriangleIsIt(check:Double){
        if(check>0)
            println("Это треугольник")
        else
            println("Это не треугольник")
    }
}