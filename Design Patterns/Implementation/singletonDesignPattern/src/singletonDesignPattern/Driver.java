package singletonDesignPattern;

public class Driver {
	public static void main(String[] args) {
		Singleton singleton=Singleton.get();
		singleton.show();
	}
}
