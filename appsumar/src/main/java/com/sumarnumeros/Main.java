package com.sumarnumeros;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @SuppressWarnings("all")
    @Override
    public void start(Stage stage) {
        // Componentes granicus
        Label txtResultado = new Label("Resultado: ");
        TextField input1 = new TextField();
        input1.setPromptText("Primer número");
        TextField input2 = new TextField();
        input2.setPromptText("Segundo número");
        Button btnSumar = new Button("Calcular Suma");

        // Evento del botón
        btnSumar.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(input1.getText());
                double num2 = Double.parseDouble(input2.getText());
                double suma = num1 + num2;
                txtResultado.setText("Resultado: " + suma);
            } catch (NumberFormatException ex) {
                txtResultado.setText("Por favor, ingresa números válidos.");
            }
        });

        // Contenedor y diseño
        VBox layout = new VBox(15, input1, input2, btnSumar, txtResultado);
        layout.setAlignment(Pos.CENTER);
        layout.setStyle("-fx-padding: 40;");

        // Escena principal
        Scene scene = new Scene(layout, 320, 280);
        stage.setTitle("Suma de Números");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}