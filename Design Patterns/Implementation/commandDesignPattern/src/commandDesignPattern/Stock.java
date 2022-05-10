package commandDesignPattern;

public class Stock {
	private String name="ABC";
	private int quantity=10;
	public void buy() {
		System.out.println("bought "+name+" "+quantity);
	}
	
	public void sell() {
		System.out.println("sold "+name+" "+quantity);
	}
}
