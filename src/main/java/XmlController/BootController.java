package XmlController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BootController extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {

            // 这里的root从FXML文件中加载进行初始化，这里FXMLLoader类用于加载FXML文件
            BorderPane root = (BorderPane)FXMLLoader.load(this.getClass().getResource("/"+"MainPanel.fxml"));
            Scene scene = new Scene(root, 500, 500);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Hello World");
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }


}
