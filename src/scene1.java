import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
public class scene1 extends Application {
    public static void main(String[] args) {
         launch(args);

    }
        public  void start(Stage primaryStage) throws IOException {
        primaryStage = new Stage(StageStyle.TRANSPARENT);
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml")); //layout reference
        Scene scn=new Scene(root);// creating the scene and then adding the final layout
        primaryStage.setScene(scn);//adding the scene to the window
        scn.getStylesheets().add(getClass().getResource("stlish.css").toExternalForm());
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        scn.setFill(Color.TRANSPARENT);
        primaryStage.show();//showing the scene

    }
}
