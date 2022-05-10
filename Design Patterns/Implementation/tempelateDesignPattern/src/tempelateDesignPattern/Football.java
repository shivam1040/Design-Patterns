package tempelateDesignPattern;

public class Football extends Game{

	@Override
	void initiallize() {
		System.out.println("Initiallize football");
	}

	@Override
	void startPlay() {
		System.out.println("start football");
	}

	@Override
	void endpPlay() {
		System.out.println("end football");
	}

}
