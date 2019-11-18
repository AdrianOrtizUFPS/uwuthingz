import kotlin.math.pow
import kotlin.math.sqrt

open class Calculadora(val valor1: Double, val valor2: Double ){
    var resultado: Double = 0.0
    fun sumar() {
        resultado = valor1 + valor2
    }

    fun restar() {
        resultado = valor1 - valor2
    }

    fun multiplicar() {
        resultado = valor1 * valor2
    }

    fun dividir() {
        resultado = valor1 / valor2
    }

    fun imprimir() {
        println("$resultado")
    }
}

class CalculadoraCientifica(valor1: Double, valor2: Double): Calculadora(valor1, valor2) {
    fun cuadrado() {
        resultado = valor1.pow(valor2)
    }

    fun raiz() {
        resultado = sqrt(valor1)
    }
}

fun main(parametro: Array<String>) {

    println("Inserte el Valor 1")
    val valor1 = readLine()!!.toDouble()
    println("Inserte el Valor 2")
    val valor2 = readLine()!!.toDouble()

    println("Clase Calculadora (suma de dos números)")
    val calculadora1 = Calculadora(valor1, valor2)
    calculadora1.sumar()
    println("Resultado de la Suma: ")
    calculadora1.imprimir()
    calculadora1.restar()
    println("Resultado de la Resta: ")
    calculadora1.imprimir()
    println("Resultado de la Multiplicación: ")
    calculadora1.multiplicar()
    calculadora1.imprimir()
    println("Resultado de la Division: ")
    calculadora1.dividir()
    calculadora1.imprimir()


    println("Clase Calculadora Cientrífica (potencia y la raiz del primero)")
    val calculadoraCientifica1 = CalculadoraCientifica(valor1, valor2)
    calculadoraCientifica1.cuadrado()
    println("Resultado de la Potencia: ")
    calculadoraCientifica1.imprimir()
    calculadoraCientifica1.raiz()
    println("Resultado de la Raiz: ")
    calculadoraCientifica1.imprimir()
}