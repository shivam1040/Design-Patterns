package prototypeDesignPattern;

public class Square extends Shape{

	public Square() {
		super.setType("Square");
	}
	
	@Override
	public void draw() {
		System.out.println("Square");
	}

}
