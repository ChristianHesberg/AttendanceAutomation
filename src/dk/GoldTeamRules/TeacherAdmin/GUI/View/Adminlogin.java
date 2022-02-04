package dk.GoldTeamRules.TeacherAdmin.GUI.View;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Adminlogin {
    public void OpenStudentlist(ActionEvent event) {

        Parent root;

        try{
            root = FXMLLoader.load(getClass().getResource("/dk/GoldTeamRules/TeacherAdmin/GUI/View/ClassWidnow.fxml"));
            Stage stage = new Stage();
            stage.setTitle("My New Stage Title");
            stage.setScene(new Scene(root, 450, 450));
            stage.show();
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();


        }
        catch(IOException e){
            e.printStackTrace();

        }

    }
}
