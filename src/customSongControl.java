import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class customSongControl {
    @FXML
    private Label directory;

    @FXML
    private Label status;

    File songFile=null;
    public void stop(MouseEvent event)
    {
        System.exit(0);
    }
    public void FileChoose(ActionEvent event)
    {
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Choose a Music File");
        chooser.showOpenDialog(null);
        songFile=chooser.getSelectedFile();
        if(songFile==null)
            directory.setText("No file Selected !!");
        else
        directory.setText(songFile.getPath());
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
    public void play(ActionEvent event) throws IOException
    {
        if(songFile==null)
        {
            status.setText("No File selected !!");
            return;
        }
        String songFilename=songFile.getName();
        int l=songFilename.length();
        if(songFilename.substring(l-3).equalsIgnoreCase("mp3")||songFile==null) {
            songPlayerController.songFile = songFile;
            songPlayerController.autoPlay();
            Parent root = FXMLLoader.load(getClass().getResource("songPlayer.fxml"));
            Scene scn = new Scene(root);
            Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scn.getStylesheets().add(getClass().getResource("stlish.css").toExternalForm()); //color and font stuff
            scn.setFill(Color.TRANSPARENT);
            primaryStage.setScene(scn);
        }
        else
            status.setText("File not compatible !!");
    }
}
