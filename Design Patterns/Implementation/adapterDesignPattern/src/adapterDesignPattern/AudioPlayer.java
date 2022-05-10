package adapterDesignPattern;

public class AudioPlayer implements MediaPlayer {
	private MediaAdapter mediaAdapter;
	
	@Override
	public void play(String audioType, String fileName) {
		//depicting inbuilt support for mp3
		if(audioType.equalsIgnoreCase("mp3"))
			System.out.println("mp3 "+fileName);
		else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter=new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}
		else
			System.out.println(audioType+" not supported");
	}

}
