package tempelateDesignPattern;

public class Driver {
	public static void main(String[] args) {
		Game game=new Cricket();
		game.play();
		game=new Football();
		game.play();
	}
}
