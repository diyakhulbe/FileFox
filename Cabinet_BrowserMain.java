package com.example.filefox;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Cabinet_BrowserMain extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Cabinet_BrowserMain.class.getResource("Cabinet_Browser.fxml"));
        stage.initStyle(StageStyle.TRANSPARENT);
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 1200, 700);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(true);
    }

    public static void main(String[] args) {
        launch();
    }
}