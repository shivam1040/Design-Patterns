package observerDesignPattern;

public class Driver {
	public static void main(String[] args) {
		Subject subject=new Subject();
		Observer observer=new BinaryObserver(subject); new OctalObserver(subject);
		subject.setState(1);
		subject.setState(2);
		subject.detach(observer);
		subject.setState(3);
	}
}
