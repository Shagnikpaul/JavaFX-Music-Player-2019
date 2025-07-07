import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class artistControl {


    public void stop(MouseEvent event)
    {
        System.exit(0);
    }
    public void back(MouseEvent event) throws IOException
    {
        Parent root= FXMLLoader.load(getClass().getResource("main.fxml"));
        Scene scn=new Scene(root);
        Stage primaryStage= (Stage)((Node)event.getSource()).getScene().getWindow();
        scn.getStylesheets().add(getClass().getResource("stlish.css").toExternalForm()); //color and font stuff
        scn.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scn);
    }
    public void playFile(ActionEvent event) throws IOException
    {
        String choice=((Button)event.getSource()).getId();
        File song=songInfo.songFile(choice);
        songPlayerController.songFile=song;
        songPlayerController.autoPlay();
        Parent root= FXMLLoader.load(getClass().getResource("songPlayer.fxml"));
        Scene scn=new Scene(root);
        Stage primaryStage= (Stage)((Node)event.getSource()).getScene().getWindow();
        scn.getStylesheets().add(getClass().getResource("stlish.css").toExternalForm());
        scn.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scn);
    }
}
