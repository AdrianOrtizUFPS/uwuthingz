import java.io.FileInputStream
import java.io.IOException
import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.Scene
import javafx.fxml.FXMLLoader
import javafx.scene.layout.Pane
import javafx.fxml.FXML

class MyFirstJavaFX : Application() {


    @Throws(IOException::class)
    fun start(stage: Stage) {
        // Create the FXMLLoader
        val loader = FXMLLoader()
        // Path to the FXML File
        val fxmlDocPath = "Línea.fxml"
        val fxmlStream = FileInputStream(fxmlDocPath)

        // Create the Pane and all Details
        val root = loader.load(fxmlStream) as Pane

        // Create the Scene
        val scene = Scene(root)
        // Set the Scene to the Stage
        stage.setScene(scene)
        // Set the Title to the Stage
        stage.setTitle("My First FXML Example")
        stage.resizableProperty().setValue(Boolean.FALSE)
        // Display the Stage
        stage.show()
    }

}
