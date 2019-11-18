/**
 * Sample Skeleton for 'Línea.fxml' Controller Class
 */

import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.TextField
import javafx.event.ActionEvent
import javax.swing.JOptionPane


class ControladorLinea {

    @FXML // fx:id="txtXPunto1"
    private val txtXPunto1: TextField? = null // Value injected by FXMLLoader

    @FXML // fx:id="txtYPunto1"
    private val txtYPunto1: TextField? = null // Value injected by FXMLLoader

    @FXML // fx:id="txtYPunto2"
    private val txtYPunto2: TextField? = null // Value injected by FXMLLoader

    @FXML // fx:id="txtXPunto2"
    private val txtXPunto2: TextField? = null // Value injected by FXMLLoader

    @FXML // fx:id="cmdActualizarCoordenadas"
    private val cmdActualizarCoordenadas: Button? = null // Value injected by FXMLLoader

    @FXML // fx:id="cmdAyuda"
    private val cmdAyuda: Button? = null // Value injected by FXMLLoader

    @FXML // fx:id="cmdDeterminarUbicacion"
    private val cmdDeterminarUbicacion: Button? = null // Value injected by FXMLLoader

    private val linea: Linea
    internal var x1: Int = 0
    internal var x2: Int = 0
    internal var y1: Int = 0
    internal var y2: Int = 0

    init {
        linea = Linea(x1, y1, x2, y2)

    }


    @FXML
    fun actualizarCoordenadas(event: ActionEvent) {
        linea.setX1(0f)
        linea.setX2(0f)
        linea.setY1(0f)
        linea.setY2(0f)

        txtXPunto1!!.setText("0.0")
        txtYPunto1!!.setText("0.0")
        txtYPunto2!!.setText("0.0")
        txtXPunto2!!.setText("0.0")
        JOptionPane.showMessageDialog(null, "Se han actualizado las coordenadas", "Enhorabuena!", JOptionPane.INFORMATION_MESSAGE)
    }

    @FXML
    fun ayuda(event: ActionEvent) {
        JOptionPane.showMessageDialog(null, "Si necesita ayuda llame al #911")
    }

    @FXML
    fun determinarUbicacion(event: ActionEvent) {
        linea.setX1(Float.parseFloat(txtXPunto1!!.getText()))
        linea.setX2(Float.parseFloat(txtXPunto2!!.getText()))
        linea.setY1(Float.parseFloat(txtYPunto1!!.getText()))
        linea.setY2(Float.parseFloat(txtYPunto2!!.getText()))
        val ubicacion = linea.getUbicacion()
        System.out.println(ubicacion)
    }

    @FXML
    fun xPunto1(event: ActionEvent) {

    }

    @FXML
    fun xPunto2(event: ActionEvent) {

    }

    @FXML
    fun yPunto1(event: ActionEvent) {

    }

    @FXML
    fun yPunto2(event: ActionEvent) {

    }

}
