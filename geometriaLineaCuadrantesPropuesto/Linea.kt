/**
 * Un ejemplo que modela un Linea usando POO
 *
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
class Linea {
    internal var x1: Float = 0.toFloat()
    internal var x2: Float = 0.toFloat()
    internal var y1: Float = 0.toFloat()
    internal var y2: Float = 0.toFloat()
    /*complete GET/SET*/

    //Complete para que la salida se lo esperado por los test...
    val ubicacion: String
    val ubi: String
        get() {
            var ubicacion = "Está en "
            var ubi = null
            if (estaEnCuadranteI()) ubi= "el primer cuadrante "
            if (estaEnCuadranteII()) ubi = "el segundo cuadrante "
            if (estaEnCuadranteIII()) ubi = "el tercer cuadrante "
            if (estaEnCuadranteIV()) ubi= "el cuarto cuadrante "
            return ubicacion + ubi
        }//fin getUbicacion

    //complete
    val cuantosCuadrantes: Int
        get() {
            var variable = 0
            if (estaEnCuadranteI()) variable++
            if (estaEnCuadranteII()) variable++
            if (estaEnCuadranteIII()) variable++
            if (estaEnCuadranteIV()) variable++
            return variable
        }//fin getCuantosCuadrantes

    /*complete*/ val pendiente: Float
        get() = (y2 - y1) / (x2 - x1)

    /*complete*/ val intersectoY: Float
        get() = y1 - pendiente * x1
    //COMPLETE las cuatro propiedades de la linea, las coordenadas de sus dos puntos

    constructor() {}

    constructor(x1: Float, y1: Float, x2: Float, y2: Float) {
        this.x1 = x1
        this.x2 = x2
        this.y1 = y1
        this.y2 = y2
        //COMPLETE
    }

    fun setX1(pX: Float) {
        x1 = pX
    }

    fun setX2(pX: Float) {
        x2 = pX
    }

    fun setY1(pY: Float) {
        y1 = pY
    }

    fun setY2(pY: Float) {
        y2 = pY
    }

    fun estaEnCuadranteI(): Boolean {
        return if (x1 > 0 && y1 > 0 || x2 > 0 && y2 > 0 || intersectoY > 0 && estaEnCuadranteII() && estaEnCuadranteIV()) true else false/*complete*/
    }//fin estaEnCuadranteI

    fun estaEnCuadranteII(): Boolean {
        return if (x1 < 0 && y1 > 0 || x2 < 0 && y2 > 0 || intersectoY > 0 && estaEnCuadranteIII() && estaEnCuadranteI()) true else false/*complete*/
    }//fin estaEnPrimerCuadranteII

    fun estaEnCuadranteIII(): Boolean {
        return if (x1 < 0 && y1 < 0 || x2 < 0 && y2 < 0 || intersectoY < 0 && estaEnCuadranteII() && estaEnCuadranteIV()) true else false/*complete*/
    }//fin estaEnCuadranteIII

    fun estaEnCuadranteIV(): Boolean {
        return if (x1 > 0 && y1 < 0 || x2 > 0 && y2 < 0 || intersectoY < 0 && estaEnCuadranteIII() && estaEnCuadranteI()) true else false/*complete*/
    }//fin estaEnCuadranteIV
}//fin clase Lin