package org.example.appgestionstock;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class HelloController {

    @FXML
    private AnchorPane main_form;

    @FXML
    private AnchorPane admin_form;


    @FXML
    private AnchorPane employee_form;

    @FXML
    private TextField admin_username;

    @FXML
    private PasswordField admin_password;

    @FXML
    private Button admin_loginBtn;

    @FXML
    private Hyperlink admin_hyperlink;

    @FXML
    private TextField employee_id;

    @FXML
    private PasswordField employee_password;

    @FXML
    private Button employee_loginBtn;

    @FXML
    private Hyperlink employee_hyperLink;


    public void switchForm(ActionEvent event) {
        if(event.getSource() == admin_hyperlink) {
            admin_form.setVisible(false);
            employee_form.setVisible(true);

        } else if (event.getSource()  == employee_hyperLink) {
            admin_form.setVisible(true);
            employee_form.setVisible(false);


        }
    }




    public void close() {
        System.exit(0);
    }

}
