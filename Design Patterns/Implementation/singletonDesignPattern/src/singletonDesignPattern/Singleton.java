package singletonDesignPattern;

public class Singleton {
	private static Singleton object=new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton get() {
		return object;
	}
	
	public void show() {
		System.out.println("Message using singleton obj");
	}
}
