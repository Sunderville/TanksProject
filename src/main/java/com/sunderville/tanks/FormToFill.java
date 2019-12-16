package com.sunderville.tanks;

import java.net.URL;
import java.util.ResourceBundle;

import com.sunderville.tanks.domain.Tank;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import com.sunderville.tanks.MainWindowController;

public class FormToFill {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button save_log_button;

    @FXML
    private Button print_button;

    @FXML
    private TextField customer_name;
    @FXML
    private MenuButton month;
    @FXML
    private MenuButton year;
    @FXML
    private MenuButton form_of_property_menubutton;

    @FXML
    private MenuItem OOO;

    @FXML
    private MenuItem AO;

    @FXML
    private MenuItem PAO;

    @FXML
    private MenuItem MUP;

    @FXML
    private MenuItem IP;

    @FXML
    private MenuItem individual;

    @FXML
    private MenuItem other_property_form;

    @FXML
    private TextField contact_name;

    @FXML
    private TextField phone_number;

    @FXML
    private TextField haul_to;

    @FXML
    private TextField quantity;

    @FXML
    private TextArea comment_field;

    @FXML
    private MenuItem january;

    @FXML
    private MenuItem february;

    @FXML
    private MenuItem march;

    @FXML
    private MenuItem april;

    @FXML
    private MenuItem may;

    @FXML
    private MenuItem june;

    @FXML
    private MenuItem july;

    @FXML
    private MenuItem august;

    @FXML
    private MenuItem september;

    @FXML
    private MenuItem october;

    @FXML
    private MenuItem november;

    @FXML
    private MenuItem december;

    @FXML
    private MenuItem unknowember;

    @FXML
    private MenuItem year2020;

    @FXML
    private MenuItem year2021;

    @FXML
    private MenuItem year2022;

    @FXML
    private MenuItem year2023;

    @FXML
    private MenuItem year2024;

    @FXML
    private MenuItem year2025;

    @FXML
    private MenuItem year2026;

    @FXML
    private MenuItem year2027;

    @FXML
    private MenuItem year2028;

    @FXML
    private MenuItem year2029;

    @FXML
    private Button return_to_main_window_button;



    @FXML
    void OOO(ActionEvent event) {
        form_of_property_menubutton.setText("ООО");
    }
    @FXML
    void AO(ActionEvent event) {
        form_of_property_menubutton.setText("АО");
    }
    @FXML
    void PAO(ActionEvent event) {
        form_of_property_menubutton.setText("ПАО");
    }
    @FXML
    void MUP(ActionEvent event) {
        form_of_property_menubutton.setText("МУП");
    }
    @FXML
    void IP(ActionEvent event) {
        form_of_property_menubutton.setText("ИП");
    }
    @FXML
    void individual(ActionEvent event) {
        form_of_property_menubutton.setText("частное лицо");
    }
    @FXML
    void other_property_form(ActionEvent event) {
        form_of_property_menubutton.setText("другая форма собственности");
    }


    @FXML
    void january(ActionEvent event) {
        month.setText("январь");
    }
    @FXML
    void february(ActionEvent event) {
        month.setText("февраль");
    }
    @FXML
    void march(ActionEvent event) {
        month.setText("март");
    }
    @FXML
    void april(ActionEvent event) {
        month.setText("апрель");
    }
    @FXML
    void may(ActionEvent event) {
        month.setText("май");
    }
    @FXML
    void june(ActionEvent event) {
        month.setText("июнь");
    }
    @FXML
    void july(ActionEvent event) {
        month.setText("июль");
    }
    @FXML
    void august(ActionEvent event) {
        month.setText("август");
    }
    @FXML
    void october(ActionEvent event) {
        month.setText("сентябрь");
    }
    @FXML
    void september(ActionEvent event) {
        month.setText("октябрь");
    }
    @FXML
    void november(ActionEvent event) {
        month.setText("ноябрь");
    }
    @FXML
    void december(ActionEvent event) {
        month.setText("декабрь");
    }
    @FXML
    void unknowember(ActionEvent event) {
        month.setText("х/з");
    }


    @FXML
    void year2020(ActionEvent event) {
        year.setText("2020");
    }
    @FXML
    void year2021(ActionEvent event) {
        year.setText("2021");
    }
    @FXML
    void year2022(ActionEvent event) {
        year.setText("2022");
    }
    @FXML
    void year2023(ActionEvent event) {
        year.setText("2023");
    }
    @FXML
    void year2024(ActionEvent event) {
        year.setText("2024");
    }
    @FXML
    void year2025(ActionEvent event) {
        year.setText("2025");
    }
    @FXML
    void year2026(ActionEvent event) {
        year.setText("2026");
    }
    @FXML
    void year2027(ActionEvent event) {
        year.setText("2027");
    }
    @FXML
    void year2028(ActionEvent event) {
        year.setText("2028");
    }
    @FXML
    void year2029(ActionEvent event) {
        year.setText("2029");
    }


    @FXML
    void initialize() {
//        compileLog(tank);

        // Реализовать
//        print_button();
//        save_log_button();




    }

    public static void compileLog(Tank tank,
                                  MenuButton month, MenuButton year,
                                  MenuButton form_of_property, TextField customer_name,
                                  TextField contact_name, TextField phone_number,
                                  TextField haul_to, TextField quantity, TextArea comment_field){



    }
}
