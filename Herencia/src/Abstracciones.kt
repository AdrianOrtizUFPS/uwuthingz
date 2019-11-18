import kotlin.math.pow
import kotlin.math.sqrt

abstract class CalculadoraAbstracta(val valor1: Double, val valor2: Double) {
    protected var resultado: Double = 0.0

    abstract fun operar()

    fun imprimir() {
        println("$resultado")
    }
}

class Suma(valor1: Double, valor2: Double): CalculadoraAbstracta(valor1, valor2) {
    override fun operar() {
        resultado = valor1 + valor2
    }
}

class Resta(valor1: Double, valor2: Double): CalculadoraAbstracta(valor1, valor2) {
    override fun operar() {
        resultado = valor1 - valor2
    }
}
class Multiplicacion(valor1: Double, valor2: Double): CalculadoraAbstracta(valor1, valor2) {
    override fun operar() {
        resultado = valor1 * valor2
    }
}
class Division(valor1: Double, valor2: Double): CalculadoraAbstracta(valor1, valor2) {
    override fun operar() {
        resultado = valor1 / valor2
    }
}
class Potencia(valor1: Double, valor2: Double): CalculadoraAbstracta(valor1, valor2) {
    override fun operar() {
        resultado = valor1.pow(valor2)
        //resultado = Math.pow(valor1,valor2)
    }
}
class RaizCuadrada(valor1: Double, valor2: Double): CalculadoraAbstracta(valor1, valor2) {
    override fun operar() {
        resultado = sqrt(valor1)
    }
}

fun main(parametro: Array<String>) {

    println("Inserte el Valor 1")
    val valor1 = readLine()!!.toDouble()
    println("Inserte el Valor 2")
    val valor2 = readLine()!!.toDouble()

    val suma1 = Suma(valor1, valor2)
    suma1.operar()
    print("El resultado de la suma es: ")
    suma1.imprimir()

    val resta1 = Resta(valor1, valor2)
    resta1.operar()
    print("El resultado de la resta es: ")
    resta1.imprimir()

    val multiplicacion1 = Multiplicacion(valor1, valor2)
    multiplicacion1.operar()
    print("El resultado de la multiplicacion es: ")
    multiplicacion1.imprimir()

    val division1 = Division(valor1, valor2)
    division1.operar()
    print("El resultado de la division es: ")
    division1.imprimir()

    val potencia1 = Potencia(valor1, valor2)
    potencia1.operar()
    print("El resultado de la potencia con base $valor1 elevado a la $valor2 es : ")
    potencia1.imprimir()

    val raizcuadrada1 = RaizCuadrada(valor1, valor2)
    raizcuadrada1.operar()
    print("El resultado de la raiz cuadrada de $valor1 es : ")
    raizcuadrada1.imprimir()
}