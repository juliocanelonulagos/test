package ejercicios
fun main (){
    println(esNumeroPar(4))
    println(esNumeroPar(3))
    println(esNumeroPar(9))
}
fun esNumeroPar(numero:Int) = numero % 2 ==0
