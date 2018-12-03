package ProjectLogIn.Controller;

import ProjectLogIn.Model.TableStudent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class LoginController {
    @FXML
    protected TextField ID,password;
    @FXML
    protected Button login;

    TableStudent ts = new TableStudent();


    /*@FXML
    public void handleLoginBtn(ActionEvent event) throws IOException {
        String userID=ID.getText();
        String userPass=password.getText();
        if(userID.equals("p")&&userPass.equals("1")){
            login = (Button) event.getSource();
            Stage stage = (Stage) login.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
            stage.setScene(new Scene(loader.load()));
            stage.show();
        }

    }*/

    @FXML
    public void handleLoginBtn(ActionEvent event){
        if (ts.checkLogin(ID.getText(),password.getText())){
            login = (Button) event.getSource();
            Stage stage = (Stage) login.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../UI/Main.fxml"));
            try {
                stage.setScene(new Scene(loader.load()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            stage.show();
        }
    }

}
