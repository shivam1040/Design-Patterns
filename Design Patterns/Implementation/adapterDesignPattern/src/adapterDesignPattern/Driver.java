package adapterDesignPattern;

public class Driver {
	public static void main(String[] args) {
		AudioPlayer audioPlayer=new AudioPlayer();
		audioPlayer.play("mp3", "A");
		audioPlayer.play("mp4", "B");
		audioPlayer.play("vlc", "C");
		audioPlayer.play("avi", "D");
	}
}
