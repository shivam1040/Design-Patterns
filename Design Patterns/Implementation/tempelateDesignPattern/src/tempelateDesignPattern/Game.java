package tempelateDesignPattern;

public abstract class Game {
	abstract void initiallize();
	abstract void startPlay();
	abstract void endpPlay();
	
	public final void play() {
		initiallize();
		startPlay();
		endpPlay();
	}
}
