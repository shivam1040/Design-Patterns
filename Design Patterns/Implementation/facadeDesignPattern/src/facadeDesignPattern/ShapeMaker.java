package facadeDesignPattern;

public class ShapeMaker {
	private Shape rectangle, circle;

	public ShapeMaker() {
		super();
		this.rectangle = new Rectangle();
		this.circle = new Circle();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}

}
