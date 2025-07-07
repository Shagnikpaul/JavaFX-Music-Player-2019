import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.*;
import java.io.IOException;
public class allSongControl
{
    @FXML
    public void stop(MouseEvent event)
    {
        System.exit(0);
    }
    @FXML
    public void back(MouseEvent event) throws IOException
        {
        Parent root= FXMLLoader.load(getClass().getResource("main.fxml"));
        Scene scn=new Scene(root);
        Stage primaryStage= (Stage)((Node)event.getSource()).getScene().getWindow();
        scn.getStylesheets().add(getClass().getResource("stlish.css").toExternalForm()); //color and font stuff
        scn.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scn);
        }
        @FXML
        public void play(ActionEvent event) throws IOException
        {
        File song;
        String choice=((Button)event.getSource()).getId();
        System.out.println(choice);
            song=songInfo.songFile(choice);
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
