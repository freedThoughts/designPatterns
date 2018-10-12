package adaptorPattern;

import adaptorPattern.Adaptee.AdvancedMediaPlayer;
import adaptorPattern.Adaptee.Mp4Player;
import adaptorPattern.Adaptee.VlcPlayer;
import adaptorPattern.ClientFacing.MediaPlayer;

// Implements Client facing interface : MediaPlayer
// Facilitates access to Adaptee : AdvancedMediaPlayer
public class Adaptor implements MediaPlayer{
	
	AdvancedMediaPlayer advancedMediaPlayer;
	
	public Adaptor(String mediaType){
		if(mediaType.equalsIgnoreCase("Vlc"))
			advancedMediaPlayer = new VlcPlayer();
		else if(mediaType.equalsIgnoreCase("Mp4"))
			advancedMediaPlayer = new Mp4Player();
	}

	@Override
	public void play(String mediaType, String fileName) {
		advancedMediaPlayer.play(mediaType, fileName);
	}

}
