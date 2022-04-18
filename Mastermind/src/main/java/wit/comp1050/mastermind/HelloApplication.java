package wit.comp1050.mastermind;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("display.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Mastermind Project");
        stage.setScene(scene);
        stage.show();


        //while (HelloController.GAME_RUNNING){
        //    String currentRowID = String.format("%sbox", HelloController.CURRENT_GAME_ROW);
        //    //HBox currentHBox = (HBox) scene.lookup(currentRowID);
//
        //}

    }

    public static void main(String[] args) {
        launch();
    }
}