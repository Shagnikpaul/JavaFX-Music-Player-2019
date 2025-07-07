import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.mp3.Mp3Parser;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.*;

public class songInfo {
    public  static  File songFile(String id)
    {
        File song=null;
        switch (id) {
            case "b1":
                song = new File("songs//Alan Walker - Alone.mp3");
                break;
            case "b2":
                song = new File("songs//Alan Walker - Darkside.mp3");
                break;
            case "b3":
                song = new File("songs//Alan Walker - Diamond Heart (feat. Sophia Somajo).mp3");
                break;
            case "b4":
                song = new File("songs//Alan Walker - Ignite.mp3");
                break;
            case "b5":
                song = new File("songs//Alan Walker - The Spectre.mp3");
                break;
            case "b6":
                song = new File("songs//AL_sic _ Sam Cross - We Are Alive.mp3");
                break;
            case "b7":
                song = new File("songs//Imagine Dragons - Believer.mp3");
                break;
            case "b8":
                song = new File("songs//Imagine Dragons - Machine.mp3");
                break;
            case "b9":
                song = new File("songs//Imagine Dragons - Thunder.mp3");
                break;
            case "b10":
                song = new File("songs//Imagine Dragons – Whatever It Takes.mp3");
                break;
            case "b11":
                song = new File("songs//Imagine Dragons - Who We Are.mp3");
                break;
            case "b12":
                song = new File("songs//Legends Never Die [Alan Walker Remix].mp3");
                break;
            case "b13":
                song = new File("songs//Linkin Park - Burn It Down.mp3");
                break;
            case "b14":
                song = new File("songs//Linkin Park - Castle of Glass.mp3");
                break;
            case "b15":
                song = new File("songs//Linkin Park - In The End (Mellen Gi _ Tommee Profitt Remix).mp3");
                break;
            case "b16":
                song = new File("songs//Linkin Park - New Divide.mp3");
                break;
            case "b17":
                song = new File("songs//Linkin Park - Numb.mp3");
                break;
            case "b18":
                song = new File("songs//Linkin Park - What I_ve Done.mp3");
                break;
            case "b19":
                song = new File("songs//PUBG Theme Song (Trap Remix).mp3");
                break;
            case "b20":
                song = new File("songs//TheFatRat - Fly Away feat. Anjulie.mp3");
                break;
            case "b21":
                song = new File("songs//TheFatRat - MAYDAY.mp3");
                break;
            case "b22":
                song = new File("songs//TheFatRat - The Calling.mp3");
                break;
            case "b23":
                song = new File("songs//TheFatRat - Time Lapse.mp3");
                break;
            case "b24":
                song = new File("songs//TheFatRat - Xenogenesis.mp3");
                break;
            case "b25":
                song = new File("songs//Unknown Brain - Superhero (feat. Chris Linton).mp3");
                break;
            case "b26":
                song = new File("songs//Unlike Pluto - Canada (Pluto Tapes).mp3");
                break;
            case "b27":
                song = new File("songs//Unlike Pluto - Closure (Year 09).mp3");
                break;
            case "b28":
                song = new File("songs//Unlike Pluto - Dollar For Your Sadness.mp3");
                break;
            case "b29":
                song = new File("songs//Unlike Pluto - Playground (Pluto Tapes).mp3");
                break;
            case "b30":
                song = new File("songs//Unlike Pluto - Worst In Me.mp3");
                break;
            case "b31":
                song = new File("songs//Zelda - Song of Storms (Deon Custom Remix).mp3");
                break;
            case"b32": song = new File("songs//Unlike Pluto - JOLT.mp3");
                    break;
        }
        return song;
    }
    public static String musicName(String filePath,String location) throws IOException, TikaException, SAXException {
        String musicName="";
        switch (filePath)
        {
            case "Alan Walker - Alone.mp3": musicName="Alone";
                                           break;
            case "Unlike Pluto - JOLT.mp3": musicName="JOLT";
                break;
                                           case "Alan Walker - Diamond Heart (feat. Sophia Somajo).mp3": musicName="Diamond Heart";
                                               break;
            case "Alan Walker - Ignite.mp3": musicName="Ignite";
                break;
            case "Alan Walker - The Spectre.mp3": musicName="Spectre";
                break;
            case "Alan Walker - Darkside.mp3": musicName="DarkSide";
                break;
                case "AL_sic _ Sam Cross - We Are Alive.mp3": musicName="We are Alive";
                break;
            case "Imagine Dragons - Believer.mp3": musicName="Believer";
                break;
            case "Imagine Dragons - Machine.mp3": musicName="Machine";
                break;
            case "Imagine Dragons - Thunder.mp3": musicName="Thunder";
                break;
            case "Imagine Dragons – Whatever It Takes.mp3": musicName="Whatever it takes";
                break;
            case "Imagine Dragons - Who We Are.mp3": musicName="Who we are";
                break;
            case "Legends Never Die [Alan Walker Remix].mp3": musicName="Legends never die";
                break;
            case "Linkin Park - Burn It Down.mp3": musicName="Burn it Down";
                break;
            case "Linkin Park - Castle of Glass.mp3": musicName="Castle of Glass";
                break;
            case "Linkin Park - In The End (Mellen Gi _ Tommee Profitt Remix).mp3": musicName="In The End";
                break;
            case "Linkin Park - New Divide.mp3": musicName="New Divide";
                break;
            case "Linkin Park - Numb.mp3": musicName="Numb";
                break;
            case "Linkin Park - What I_ve Done.mp3": musicName="What I've Done";
            break;
                case "PUBG Theme Song (Trap Remix).mp3": musicName="Pubg Theme Song";
                break;
            case "TheFatRat - Fly Away feat. Anjulie.mp3": musicName="Fly Away";
                break;
            case "TheFatRat - MAYDAY.mp3": musicName="MAYDAY";
                break;
            case "TheFatRat - The Calling.mp3": musicName="The Calling";
                break;
            case "TheFatRat - Time Lapse.mp3": musicName="Time Lapse";
                break;
            case "Unknown Brain - Superhero (feat. Chris Linton).mp3": musicName="Superhero";
                break;
            case "Unlike Pluto - Canada (Pluto Tapes).mp3": musicName="Canada";
                break;
            case "Unlike Pluto - Closure (Year 09).mp3": musicName="Closure";
                break;
            case "Unlike Pluto - Dollar For Your Sadness.mp3": musicName="Dollar For Your Sadness";
                break;
            case "TheFatRat - Xenogenesis.mp3": musicName="Xenogensis";
                break;
                case "Unlike Pluto - Playground (Pluto Tapes).mp3": musicName="Playground";
                break;
            case "Unlike Pluto - Worst In Me.mp3": musicName="Worst In Me";
                break;
            case "Zelda - Song of Storms (Deon Custom Remix).mp3": musicName="Song of Storms";
                break;
            default: InputStream inputStream=new FileInputStream(new File(location));
                ContentHandler handler=new DefaultHandler();
                Metadata metadata=new Metadata();
                Parser parser=new Mp3Parser();
                ParseContext parseContext=new ParseContext();
                parser.parse(inputStream,handler,metadata,parseContext);
                musicName=metadata.get("title");
        }
        return musicName.toUpperCase();
    }
    public static String artistName(String filePath,String location) throws TikaException, SAXException, IOException {
        String artistName="";
        switch (filePath)
        {
            case "Alan Walker - Alone.mp3": artistName="Alan Walker";
                break;
            case "Alan Walker - Diamond Heart (feat. Sophia Somajo).mp3": artistName="Alan Walker,Sophia Somajo";
                break;
            case "Alan Walker - Ignite.mp3": artistName="Alan Walker";
                break;
            case "Alan Walker - The Spectre.mp3": artistName="Alan Walker";
                break;
            case "AL_sic _ Sam Cross - We Are Alive.mp3": artistName="AL'sic & Sam Cross";
                break;
            case "Imagine Dragons - Believer.mp3": artistName="Imagine Dragons";
                break;
            case "Imagine Dragons - Machine.mp3": artistName="Imagine Dragons";
                break;
            case "Imagine Dragons - Thunder.mp3": artistName="Imagine Dragons";
                break;
            case "Imagine Dragons – Whatever It Takes.mp3": artistName="Imagine Dragons";
                break;
            case "Imagine Dragons - Who We Are.mp3": artistName="Imagine Dragons";
                break;
            case "Legends Never Die [Alan Walker Remix].mp3": artistName="Alan Walker,J.Fla";
                break;
            case "Linkin Park - Burn It Down.mp3": artistName="Linkin Park";
                break;
            case "Linkin Park - Castle of Glass.mp3": artistName="Linkin Park";
                break;
            case "Linkin Park - In The End (Mellen Gi _ Tommee Profitt Remix).mp3": artistName="Linkin Park,Mellen Gi,Tommee Profit";
                break;
            case "Linkin Park - New Divide.mp3": artistName="Linkin Park";
                break;
            case "Linkin Park - Numb.mp3": artistName="Linkin Park";
                break;
            case "Linkin Park - What I_ve Done.mp3": artistName="Linkin Park";
                break;
                case "PUBG Theme Song (Trap Remix).mp3": artistName="PUBG";
                break;
            case "TheFatRat - Fly Away feat. Anjulie.mp3": artistName="TheFatRat";
                break;
            case "TheFatRat - MAYDAY.mp3": artistName="TheFatRat";
                break;
            case "TheFatRat - The Calling.mp3": artistName="TheFatRat";
                break;
            case "TheFatRat - Time Lapse.mp3": artistName="TheFatRat";
                break;
            case "TheFatRat - Xenogenesis.mp3": artistName="TheFatRat";
            break;
                case "Unknown Brain - Superhero (feat. Chris Linton).mp3": artistName="Unknown Brain";
                break;
            case "Unlike Pluto - Canada (Pluto Tapes).mp3": artistName="Unlike Pluto";
                break;
            case "Unlike Pluto - Closure (Year 09).mp3": artistName="Unlike Pluto";
                break;
            case "Unlike Pluto - Dollar For Your Sadness.mp3": artistName="Unlike Pluto";
                break;
            case "Unlike Pluto - Playground (Pluto Tapes).mp3": artistName="Unlike Pluto";
                break;
            case "Unlike Pluto - Worst In Me.mp3": artistName="Unlike Pluto";
                break;
            case "Zelda - Song of Storms (Deon Custom Remix).mp3": artistName="Zelda,Deon";
                break;
            case "Alan Walker - Darkside.mp3": artistName="Alan walker";
            break;
            case "Unlike Pluto - JOLT.mp3": artistName="Unlike Pluto";
            break;
            default: InputStream inputStream=new FileInputStream(new File(location));
                     ContentHandler handler=new DefaultHandler();
                     Metadata metadata=new Metadata();
                     Parser parser=new Mp3Parser();
                     ParseContext parseContext=new ParseContext();
                     parser.parse(inputStream,handler,metadata,parseContext);
                     artistName=metadata.get("xmpDM:artist");
        }
        return artistName;
    }
    public static File artistAlbum(String FilePath)
    {
        File ImageFile=null;
        String path = "";
        switch (FilePath)
        {
            case "Alan Walker - Alone.mp3": path="src/images/album art final - Copy/Alone.jpg";
                break;
            case "Alan Walker - Diamond Heart (feat. Sophia Somajo)": path="src/images/album art final - Copy/diamondHeart.jpg";
                break;
            case "Alan Walker - Ignite.mp3": path="src/images/album art final - Copy/ignite.jpg";
                break;
            case "Alan Walker - The Spectre.mp3": path="src/images/album art final - Copy/theSpectre.jpg";
                break;
            case "AL_sic _ Sam Cross - We Are Alive.mp3": path="src/images/album art final - Copy/weAreAlive.jpg";
                break;
            case "Imagine Dragons - Believer.mp3": path="src/images/album art final - Copy/believer.jpg";
                break;
            case "Imagine Dragons - Machine.mp3": path="src/images/album art final - Copy/machine.jpg";
                break;
            case "Imagine Dragons - Thunder.mp3": path="src/images/album art final - Copy/thunder.jpg";
                break;
            case "Imagine Dragons – Whatever It Takes.mp3": path="src/images/album art final - Copy/whateverItTakes.jpg";
                break;
            case "Imagine Dragons - Who We Are.mp3": path="src/images/album art final - Copy/whoWeAre.jpg";
                break;
            case "Legends Never Die [Alan Walker Remix].mp3": path="src/images/album art final - Copy/legendsNeverDie.jpg";
                break;
            case "Linkin Park - Burn It Down.mp3": path="src/images/album art final - Copy/burnItDown.jpg";
                break;
            case "Linkin Park - Castle of Glass.mp3": path="src/images/album art final - Copy/castleOfGlass.jpg";
                break;
            case "Linkin Park - In The End (Mellen Gi _ Tommee Profitt Remix).mp3": path="src/images/album art final - Copy/inTheEnd.jpg";
                break;
            case "Linkin Park - New Divide.mp3": path="src/images/album art final - Copy/newDivide.jpg";
                break;
            case "Linkin Park - Numb.mp3": path="src/images/album art final - Copy/numb.jpg";
                break;
            case "Linkin Park - What I_ve Done.mp3":path="src/images/album art final - Copy/whatIveDone.jpg";
                break;
            case "PUBG Theme Song (Trap Remix).mp3": path="src/images/album art final - Copy/pubgTheme.jpg";
                break;
            case "TheFatRat - Fly Away feat. Anjulie.mp3": path="src/images/album art final - Copy/flyAway.jpg";
                break;
            case "TheFatRat - MAYDAY.mp3": path="src/images/album art final - Copy/mayday.jpg";
                break;
            case "TheFatRat - The Calling.mp3": path="src/images/album art final - Copy/theCalling.jpg";
                break;
            case "TheFatRat - Time Lapse.mp3": path="src/images/album art final - Copy/timeLapse.jpg";
                break;
            case "TheFatRat - Xenogenesis.mp3": path="src/images/album art final - Copy/xenogenesis.jpg";
                break;
            case "Unknown Brain - Superhero (feat. Chris Linton).mp3": path="src/images/album art final - Copy/superHero.jpg";
                break;
            case "Unlike Pluto - Canada (Pluto Tapes).mp3": path="src/images/album art final - Copy/canada.jpg";
                break;
            case "Unlike Pluto - Closure (Year 09).mp3": path="src/images/album art final - Copy/closure.jpg";
                break;
            case "Unlike Pluto - Dollar For Your Sadness.mp3": path="src/images/album art final - Copy/dollarForYourSadness.jpg";
                break;
            case "Unlike Pluto - Playground (Pluto Tapes).mp3": path="src/images/album art final - Copy/playground.jpg";
                break;
            case "Unlike Pluto - Worst In Me.mp3": path="src/images/album art final - Copy/worstInMe.jpg";
                break;
            case "Unlike Pluto - JOLT.mp3":path="src/images/album art final - Copy/jolt.jpg";
                break;
            case "Zelda - Song of Storms (Deon Custom Remix).mp3": path="Zelda,Deon";
                break;
            case "Alan Walker - Darkside.mp3": path="src/images/album art final - Copy/darkside.jpg";
                break;
            default:path="src/images/default.jpg";
        }
        ImageFile =new File(path);
        return ImageFile;
    }
}
