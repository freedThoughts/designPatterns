package adaptorPattern;

import java.util.Arrays;

import adaptorPattern.ClientFacing.AudioPlayer;
import adaptorPattern.ClientFacing.MediaPlayer;

public class Client {

	public static void main(String[] args) {
	
		MediaPlayer player = new AudioPlayer();
		player.play("vlc", "Filename");
		player.play("mp3", "Filename");
		player.play("mp4", "Filename");
		
		// Client may call directly Adaptor to access AdvancedMediaPlayer with MediaPlayer interface
/*		Adapter design pattern makes incompatible interfaces work together, without changing them. 
		Only new code which is inserted is in the form of Adapter or Wrapper class*/
		MediaPlayer player2 = new Adaptor("mp4");
		player2.play("mp4", "Filename");
		
		
		MediaPlayer player3 = new Adaptor("vlc");
		player3.play("vlc", "Filename");
		
	}

}
