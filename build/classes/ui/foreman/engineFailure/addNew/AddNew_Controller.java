package ui.foreman.engineFailure.addNew;

import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by piumiindeevari on 9/5/2017.
 */


public class AddNew_Controller implements Initializable {


    public ComboBox cmbbox_CurrentState;
    public TextField txtfld_Emp_No;
    public TextField txtfld_EngineNo;
    public TextField txtfld_TripId;
    public TextArea txtarea_DriverNote;
    public ComboBox cmbbox_EngineType;
    public TextField txtfld_Date;
    public TextArea txtarea_ForemanNote;
    public TextArea txtarea_FailureNature;


    @Override
    public void initialize(URL location, ResourceBundle resources) {



        this.txtfld_Date.setText(ui.GlobalVar.currentDate);

        this.txtarea_DriverNote.setText(ui.GlobalVar.user);
    }
}
