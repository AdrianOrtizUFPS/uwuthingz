/**
 * Main / ejecutable para realizar calculos con Linea.
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
object EjecutableLinea {

    /**
     * @param args the command line arguments
     */
    fun main(args: Array<String>) {
        val l = Linea()
        val gui = FrmLinea(l)
        gui.setVisible(true)
    }

}