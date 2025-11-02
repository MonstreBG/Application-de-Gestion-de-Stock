package org.example.appgestionstock;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloApplication extends Application {

    // Variables pour stocker la position du clic
    private double xOffset = 0;
    private double yOffset = 0;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LoginAdmin.fxml"));

        // On récupère la racine du FXML
        Parent root = fxmlLoader.load();

        // Création de la scène
        Scene scene = new Scene(root);

        // Permet de déplacer la fenêtre en cliquant et glissant
        root.setOnMousePressed((MouseEvent event) -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });

        root.setOnMouseDragged((MouseEvent event) -> {
            stage.setX(event.getScreenX() - xOffset);
            stage.setY(event.getScreenY() - yOffset);

            stage.setOpacity(.8);
        });

        root.setOnMouseReleased((MouseEvent event)  ->{
            stage.setOpacity(1);
        });


        // On enlève le style de fenêtre par défaut (bordure + barre titre)
        stage.initStyle(StageStyle.TRANSPARENT);

        stage.setScene(scene);
        stage.setTitle("AppGestion Stock");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
