package adaptorPattern.ClientFacing;

import adaptorPattern.Adaptor;

public class AudioPlayer implements MediaPlayer{

	@Override
	public void play(String mediaType, String fileName) {
		if(mediaType.equalsIgnoreCase("mp3")){
			System.out.println("Playing MP3 ");
		} 
		
		
/*******		

		// New condition added with help of Adaptor to facilitate AdvancedMediaPlayer
		else if(mediaType.equalsIgnoreCase("mp4") || mediaType.equalsIgnoreCase("Vlc") ){
			Adaptor adaptor = new Adaptor(mediaType);
			adaptor.play(mediaType, fileName);
		}
		
		******/
		
		
		else System.out.println("Media type not available");
	}


}
