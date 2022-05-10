package prototypeDesignPattern;

public class Rectangle extends Shape{

	public Rectangle() {
		super.setType("Rectangle");
	}
	@Override
	public void draw() {
		System.out.println("Rectangle");
		
	}
	
}
