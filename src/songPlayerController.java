import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import jaco.mp3.player.MP3Player;
import org.apache.tika.exception.TikaException;
import org.xml.sax.SAXException;


public class songPlayerController implements Initializable {

    @FXML
    private Label songName;

    @FXML
    private Label artist;

    @FXML
    private ImageView playPause;

    @FXML
    private ImageView albumArt;

    static File songFile;
    static File[] songList=new File[50];
    static int count=0;
    static int num=0;
    static MP3Player player;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            songName.setText(songInfo.musicName(songFile.getName(),songFile.getPath()));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TikaException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        try {
            artist.setText(songInfo.artistName(songFile.getName(),songFile.getPath()));
        } catch (TikaException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File file = songInfo.artistAlbum(songFile.getName());
        Image image = new Image(file.toURI().toString());
        albumArt.setImage(image);
    }
    public void addSong(ActionEvent event)
    {
        String choice=((Button)event.getSource()).getId();
        if(count<50)
        {
            count++;
            songList[count]=songInfo.songFile(choice);
            player.addToPlayList(songList[count]);
        }
        else
            return;
    }
    public static void autoPlay()
    {
        songList[0]=songFile;
        player=new MP3Player(songList[0]);
        player.play();
    }
    @FXML
    public void previous(MouseEvent event) throws TikaException, IOException, SAXException {
        if(num==0)
        {
            System.out.println("array end reached");
            return;
        }
        else
        {
            num--;
            songName.setText(songInfo.musicName(songList[num].getName(),songList[num].getPath()));
            artist.setText(songInfo.artistName(songList[num].getName(),songList[num].getPath()));
            File file = songInfo.artistAlbum(songList[num].getName());
            Image image = new Image(file.toURI().toString());
            albumArt.setImage(image);
            player.skipBackward();
    }
    }
    @FXML
    public void next(MouseEvent event) throws TikaException, IOException, SAXException {
        if((count-num)==0)
        {
            System.out.println("No song after this");
            return;
        }
        else {
            num++;
            songName.setText(songInfo.musicName(songList[num].getName(),songList[num].getPath()));
            artist.setText(songInfo.artistName(songList[num].getName(),songList[num].getPath()));
            File file = songInfo.artistAlbum(songList[num].getName());
            Image image = new Image(file.toURI().toString());
            albumArt.setImage(image);
            player.skipForward();
        }
    }
    @FXML
    public void exit(MouseEvent event)
    {
        Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        primaryStage.close();
    }
    @FXML
    public void back(MouseEvent event) throws IOException
    {
        player.stop();
        num=0;
        count=0;
        for(int i=0;i<50;i++)
        {
            songList[i]=null;
        }
        Parent root=FXMLLoader.load(getClass().getResource("main.fxml"));
        Scene scn = new Scene(root);
        Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scn.getStylesheets().add(getClass().getResource("stlish.css").toExternalForm());
        scn.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scn);
    }
    @FXML
    public void playPause(MouseEvent event)
    {
        if(player.isPaused())
        {
            File file = new File("src/images/pause.png");
            Image image = new Image(file.toURI().toString());
            playPause.setImage(image);
            player.play();
        }
        else
        {
            File file = new File("src/images/play.png");
            Image image = new Image(file.toURI().toString());
            playPause.setImage(image);
            player.pause();
        }
    }
}
