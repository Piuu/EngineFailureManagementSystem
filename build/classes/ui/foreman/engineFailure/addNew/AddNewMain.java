package ui.foreman.engineFailure.addNew; /**
 * Created by piumiindeevari on 9/5/2017.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import static javafx.stage.StageStyle.DECORATED;

public class AddNewMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage)throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("AddNew.fxml"));
        stage.setTitle("Engine Failure Management System - SLR");
        stage.initStyle(DECORATED);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();

    }
}
