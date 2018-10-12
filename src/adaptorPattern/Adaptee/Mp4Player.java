package adaptorPattern.Adaptee;

public class Mp4Player implements AdvancedMediaPlayer{

	@Override
	public void play(String mediaType, String fileName) {
		System.out.println("Playing " + mediaType);
		
	}


}
