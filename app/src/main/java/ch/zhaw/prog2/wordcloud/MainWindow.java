package ch.zhaw.prog2.wordcloud;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindow extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

    }
    private void openMainWindow(Stage stage) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));

        try{
            Pane rootNode = loader.load();
            Scene scene = new Scene(rootNode);
            stage.setScene(scene);
            stage.show();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }

}
