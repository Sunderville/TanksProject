//package com.sunderville.tanks;
//
//public class MainWindowController {
//}

package com.sunderville.tanks;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.sunderville.tanks.animations.Shake;
import com.sunderville.tanks.domain.Consolidation;
import com.sunderville.tanks.domain.SteelType;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainWindowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField ring12;

    @FXML
    private TextField ring11;

    @FXML
    private TextField ring10;

    @FXML
    private TextField ring9;

    @FXML
    private TextField ring8;

    @FXML
    private TextField ring7;

    @FXML
    private TextField ring6;

    @FXML
    private TextField ring5;

    @FXML
    private TextField ring4;

    @FXML
    private TextField ring3;

    @FXML
    private TextField ring2;

    @FXML
    private TextField ring1;

    @FXML
    private TextField bottom_center_thikness;

    @FXML
    private TextField bottom_rim_thikness;

    @FXML
    private TextField roof_thikness;

    @FXML
    private Button log_button;

    @FXML
    private Button calculate_button;

    @FXML
    private TextField insulation_weight;

    @FXML
    private TextField heater_weight;

    @FXML
    private TextField other_weight1;

    @FXML
    private TextField other_weight2;

    @FXML
    private TextField other_weight1_name;

    @FXML
    private TextField other_weight2_name;

    @FXML
    private MenuButton steel_menu;
    @FXML
    private MenuItem s09selection;
    @FXML
    private MenuItem s12selection;

    @FXML
    private TextField result_mass;

    @FXML
    private TextField ton_price;

    @FXML
    private TextField result_price;

    @FXML
    private MenuButton diameter;

    @FXML
    private MenuItem d3800;
    @FXML
    private MenuItem d4730;
    @FXML
    private MenuItem d6630;
    @FXML
    private MenuItem d7580;
    @FXML
    private MenuItem d8530;
    @FXML
    private MenuItem d10430;
    @FXML
    private MenuItem d15180;
    @FXML
    private MenuItem d18980;
    @FXML
    private MenuItem d20920;
    @FXML
    private MenuItem d22800;
    @FXML
    private MenuItem d28500;
    @FXML
    private MenuItem d34200;
    @FXML
    private MenuItem d39900;
    @FXML
    private MenuItem d45600;
    @FXML
    private MenuItem d60700;

    @FXML
    void d15180s(ActionEvent event) {
        diameter.setText("15.18f");
    }
    @FXML
    void d18980s(ActionEvent event) {
        diameter.setText("18.98f");
    }
    @FXML
    void d20920s(ActionEvent event) {
        diameter.setText("20.92f");
    }
    @FXML
    void d22800s(ActionEvent event) {
        diameter.setText("22.8f");
    }
    @FXML
    void d28500s(ActionEvent event) {
        diameter.setText("28.5f");
    }
    @FXML
    void d3800s(ActionEvent event) {
        diameter.setText("3.8f");
    }
    @FXML
    void d39900s(ActionEvent event) {
        diameter.setText("39.9f");
    }
    @FXML
    void d45600s(ActionEvent event) {
        diameter.setText("45.6f");
    }
    @FXML
    void d4730s(ActionEvent event) {
        diameter.setText("4.73f");
    }
    @FXML
    void d7580s(ActionEvent event) {
        diameter.setText("7.58f");
    }
    @FXML
    void d8530s(ActionEvent event) {
        diameter.setText("8.53f");
    }

    @FXML
    private Button information_button;

    @FXML
    void s09selected(ActionEvent event) {
        steel_menu.setText("09Г2С");
    }

    @FXML
    void s12selected(ActionEvent event) {
        steel_menu.setText("12Х18Н10Т");
    }

    @FXML
    void initialize() {

        calculate_button.setOnAction(actionEvent -> {

            if(!diameter.getText().equals("")){
                result_mass.setText(String.valueOf(Consolidation.getResultMass(diameter.getText(), ring1.getText(), ring2.getText(), ring3.getText(), ring4.getText(), ring5.getText(), ring6.getText(),
                        ring7.getText(), ring8.getText(), ring9.getText(), ring10.getText(), ring11.getText(), ring12.getText(), bottom_center_thikness.getText(),
                        bottom_rim_thikness.getText(), roof_thikness.getText(), insulation_weight.getText(), heater_weight.getText(), other_weight1_name.getText(),
                        other_weight1.getText(), other_weight2_name.getText(), other_weight2.getText(), steel_menu.getText(), ton_price.getText())));
            }else {
                Shake shake = new Shake(diameter);
                shake.playShake();

                // Сделать в виде всплывающего окна
                System.out.println("Задайте диаметр");}

        });




        information_button.setOnAction(event -> {
            information_button.getScene().getWindow().hide();

            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/fxml/Information.fxml"));

            try {
                fxmlLoader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = fxmlLoader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

    }


}

