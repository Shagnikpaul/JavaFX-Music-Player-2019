import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class mainControls {

    int i=0;
    public  void artistMenu(MouseEvent event) throws IOException
    {
        i++;
        System.out.println("NOICE ! x"+i);
        Parent root= FXMLLoader.load(getClass().getResource("artis.fxml"));
        Scene scn=new Scene(root);
        Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow(); // refers to the original stage and changes the scene in that stage only
        scn.getStylesheets().add(getClass().getResource("stlish.css").toExternalForm()); //color and font stuff
        scn.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scn);
    }
    public void allSongsMenu(MouseEvent event)throws IOException{
        Parent root=FXMLLoader.load(getClass().getResource("allSongs.fxml"));
        Scene scn=new Scene(root);
        Stage primaryStage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scn.getStylesheets().add(getClass().getResource("stlish.css").toExternalForm()); //color and font stuff
        scn.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scn);


    }
    public void playlistMenu(MouseEvent event) throws IOException{
        Parent root=FXMLLoader.load(getClass().getResource("playlistMenu.fxml"));
        Scene scn=new Scene(root);
        Stage primaryStage= (Stage)((Node)event.getSource()).getScene().getWindow();
        scn.getStylesheets().add(getClass().getResource("stlish.css").toExternalForm()); //color and font stuff
        scn.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scn);
    }
    public void customSongMenu(MouseEvent event) throws IOException{
        Parent root=FXMLLoader.load(getClass().getResource("customSong.fxml"));
        Scene scn=new Scene(root);
        Stage primaryStage= (Stage)((Node)event.getSource()).getScene().getWindow();
        scn.getStylesheets().add(getClass().getResource("stlish.css").toExternalForm()); //color and font stuff
        scn.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scn);
    }
    public void songControl(MouseEvent event) throws IOException{
        Parent root=FXMLLoader.load(getClass().getResource("songPlayer.fxml"));
        Scene scn=new Scene(root);
        Stage primaryStage= (Stage)((Node)event.getSource()).getScene().getWindow();
        scn.getStylesheets().add(getClass().getResource("stlish.css").toExternalForm()); //color and font stuff
        scn.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scn);
    }
    public void stop()
    {
        System.exit(0);
    }
}
