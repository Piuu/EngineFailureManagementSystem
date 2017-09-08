package ui;
/**
 * Created by piumiindeevari on 9/7/2017.
 */
import javafx.fxml.Initializable;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class GlobalVar implements Initializable{

    public static String user;

    public static String currentDate;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd   (HH:mm)");
        Date date = new Date();
        System.out.println(dateFormat.format(date)); //2017/09/16 (12:08:43)
        currentDate = dateFormat.format(date);
        user = "help";
    }
}
