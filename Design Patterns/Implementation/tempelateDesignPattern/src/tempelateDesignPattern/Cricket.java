package tempelateDesignPattern;

public class Cricket extends Game{

	@Override
	void initiallize() {
		System.out.println("Initiallize cricket");
	}

	@Override
	void startPlay() {
		System.out.println("start cricket");
	}

	@Override
	void endpPlay() {
		System.out.println("end cricket");
	}

}
