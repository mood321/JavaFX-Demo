package XmlController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MainPaneController {
//<!--这里的Button对象有需要加@FXML注解，然后变量的名称为你刚才在FXML文件中声明的Button的id属性-->
    @FXML
    private Button btnHello;


   // <!--这里的handleButtonAction方法为我们在FXML文件中声明的onAction的处理函数-->
    @FXML
    protected void handleButtonAction(ActionEvent event) {
        btnHello.setText("Hello World, I am JavaFX!");
    }
    @FXML private TextField usernameField ;
    @FXML private PasswordField password ;

   //  @FXML private Button submitButton;



    @FXML protected void handlePasswordFieldAction(ActionEvent event) {
        System.out.println("MainPaneController.handlePasswordFieldAction");
       // usernameField.setText("Submit button pressed");

    }



    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        System.out.println(password.getText() );
        usernameField.setText("Enter key pressed");

    }
}
