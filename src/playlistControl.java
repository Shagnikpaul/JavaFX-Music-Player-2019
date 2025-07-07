import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class playlistControl {
    public void stop(MouseEvent event)
    {
        System.exit(0);
    }
    public void play1(ActionEvent event) throws IOException {
      File song1 = songInfo.songFile("b3");
      songPlayerController.songFile=song1;
      songPlayerController.songList[0]=song1;
      File song2 = songInfo.songFile("b21");
        songPlayerController.songList[1]=song2;
      File song3 = songInfo.songFile("b11");
        songPlayerController.songList[2]=song3;
      File song4 = songInfo.songFile("b8");
        songPlayerController.songList[3]=song4;
      File song5 = songInfo.songFile("b6");
        songPlayerController.songList[4]=song5;
        songPlayerController.count=4;
        songPlayerController.autoPlay();
        songPlayerController.player.addToPlayList(song2);
        songPlayerController.player.addToPlayList(song3);
        songPlayerController.player.addToPlayList(song4);
        songPlayerController.player.addToPlayList(song5);
        Parent root= FXMLLoader.load(getClass().getResource("songPlayer.fxml"));
        Scene scn=new Scene(root);
        Stage primaryStage= (Stage)((Node)event.getSource()).getScene().getWindow();
        scn.getStylesheets().add(getClass().getResource("stlish.css").toExternalForm());
        scn.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scn);

    }
    public void play2(ActionEvent event) throws IOException {
        File song1= songInfo.songFile("b20");
        File song2= songInfo.songFile("b22");
        File song3= songInfo.songFile("b15");
        File song4= songInfo.songFile("b17");
        File song5= songInfo.songFile("b19");
        songPlayerController.songList[0]=song1;
        songPlayerController.songList[1]=song2;
        songPlayerController.songList[2]=song3;
        songPlayerController.songList[3]=song4;
        songPlayerController.songList[4]=song5;
        songPlayerController.songFile=song1;
        songPlayerController.count=4;
        songPlayerController.autoPlay();
        songPlayerController.player.addToPlayList(song2);
        songPlayerController.player.addToPlayList(song3);
        songPlayerController.player.addToPlayList(song4);
        songPlayerController.player.addToPlayList(song5);
        Parent root= FXMLLoader.load(getClass().getResource("songPlayer.fxml"));
        Scene scn=new Scene(root);
        Stage primaryStage= (Stage)((Node)event.getSource()).getScene().getWindow();
        scn.getStylesheets().add(getClass().getResource("stlish.css").toExternalForm());
        scn.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scn);
    }
    public void play3(ActionEvent event) throws IOException {
        File song1= songInfo.songFile("b1");
        File song2= songInfo.songFile("b6");
        File song3= songInfo.songFile("b7");
        File song4= songInfo.songFile("b18");
        File song5= songInfo.songFile("b28");
        songPlayerController.songList[0]=song1;
        songPlayerController.songList[1]=song2;
        songPlayerController.songList[2]=song3;
        songPlayerController.songList[3]=song4;
        songPlayerController.songList[4]=song5;
        songPlayerController.songFile=song1;
        songPlayerController.count=4;
        songPlayerController.autoPlay();
        songPlayerController.player.addToPlayList(song2);
        songPlayerController.player.addToPlayList(song3);
        songPlayerController.player.addToPlayList(song4);
        songPlayerController.player.addToPlayList(song5);
        Parent root= FXMLLoader.load(getClass().getResource("songPlayer.fxml"));
        Scene scn=new Scene(root);
        Stage primaryStage= (Stage)((Node)event.getSource()).getScene().getWindow();
        scn.getStylesheets().add(getClass().getResource("stlish.css").toExternalForm());
        scn.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scn);
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
}
