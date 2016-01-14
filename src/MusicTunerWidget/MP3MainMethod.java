

package MusicTunerWidget;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;        

public class MP3MainMethod {
    
    FileInputStream FIS;
   BufferedInputStream BIS;
   
   public Player player;
   
   public long pauseLocation;// the long data type is used
   // to return a high value for the pause even for a 5 min song
   //do not to be used if the song is counted in seconds
   public long songTotalLength;
   public String fileLocation;
   public void Stop()
   {
     if(player != null) // need to stop music playing
     {
         player.close();
         pauseLocation = 0;
         songTotalLength = 0;
        MP3TunerMusicPlayer.ArtistSong.setText("");
       
     }
   }
    public void Pause()
   {
     if(player != null) // need to stop music playing
     {   
         try 
         {
         //measures how much track is available still to play
          pauseLocation = FIS.available();
         // will assign whatever time left to the pause location
         player.close();
         }
         catch (IOException ex) 
         {
         }
         
     }
   }// end pause
    public void Resume()
   {
       try {
           // this will get the path of the music in your folder
           FIS = new FileInputStream(fileLocation);
           // file input stream
           BIS = new BufferedInputStream(FIS);
          
           player = new Player(BIS);
           // use to skip as much of the song as you need to
           FIS.skip(songTotalLength - pauseLocation);    
           
           }
           catch (FileNotFoundException | JavaLayerException ex) 
           {//this is called a double catch try statement saves memory
            // need a thread to allow music to play in the background
           } catch (IOException ex) {

       }// whilst using the control play/stop panel
            
           new Thread()
           {
                 @Override
                 public void run()
                 {
                   try 
                   {
                         player.play();
                    }
                    catch (JavaLayerException ex) 
                    {
                     // need a try catch statement with the 
                    }
                 }
           }.start();// this allows 2 threads to run at once
   }// end resume
    
   public void Play(String path)
   {
       try {
           // this will get the path of the music in your folder
           FIS = new FileInputStream(path);
           // file input stream
           BIS = new BufferedInputStream(FIS);
          
           player = new Player(BIS);
           // this is the length of the song
           songTotalLength  = FIS.available();
           // we re-assign the path from resume method
           fileLocation = path + "";
               // will require 2nd catch remove try modify it
               // and re-insert after the catch filenotfound
           try {// I need a 2nd available method related to the resume method
           //  next I need a 2nd long variable songTotal
               FIS.available();
           } catch (IOException ex) {
              
           }
           
           }
           catch (FileNotFoundException | JavaLayerException ex) 
           {//this is called a double catch try statement saves memory
            // need a thread to allow music to play in the background
           } catch (IOException ex) {
           
       }// whilst using the control play/stop panel
           new Thread()
           {
                 @Override
                 public void run()
                 {
                   try 
                   {
                         player.play();
                         
                         if(player.isComplete() && MP3TunerMusicPlayer.count == 1){
                           Play(fileLocation);// this will create a loop involving
                           // the switch statement for the most current location
                           if(player.isComplete()){
                               MP3TunerMusicPlayer.ArtistSong.setText("");
                           }
                          //boolean expression
                         }
                    }
                    catch (JavaLayerException ex) 
                    {
                     // need a try catch statement with the 
                    }
                 }
           }.start();// this allows 2 threads to run at once
   }// end play
    
}
