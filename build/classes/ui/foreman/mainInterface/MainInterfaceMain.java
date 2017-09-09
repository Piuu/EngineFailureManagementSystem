package ui.foreman.mainInterface;/**
 * Created by piumiindeevari on 9/6/2017.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.stage.StageStyle.DECORATED;

public class MainInterfaceMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MainInterface.fxml"));
        stage.setTitle("Engine Failure Management System - SLR");
        stage.initStyle(DECORATED);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }
}
