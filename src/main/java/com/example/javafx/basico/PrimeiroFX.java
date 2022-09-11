package com.example.javafx.basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception { // primaryStage é o palco principal

        Button botaoA = new Button("A");
        Button botaoB = new Button("B");
        Button botaoC = new Button("C");
        botaoA.setOnAction(e -> {
            System.out.println("A");
        });
        botaoB.setOnAction(e -> {
            System.out.println("B");

        });
        botaoC.setOnAction(e -> {
            System.exit(0);
        });
        VBox box = new VBox(); // VBox organiza os componetes na vertical e o HBox na horizontal
        box.setAlignment(Pos.CENTER);
        box.setSpacing(10);
        box.getChildren().add(botaoA);
        box.getChildren().add(botaoB);
        box.getChildren().add(botaoC);

        Scene unicaCena = new Scene(box, 150, 100);
        primaryStage.setScene(unicaCena);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // metodo para executar o javaFX
    }
}
