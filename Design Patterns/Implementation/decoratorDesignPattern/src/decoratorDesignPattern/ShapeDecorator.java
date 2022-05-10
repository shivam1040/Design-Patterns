package decoratorDesignPattern;

public abstract class ShapeDecorator implements Shape {
	public Shape shape;
	@Override
	public void draw() {
		shape.draw();
	}
	
	public ShapeDecorator(Shape shape) {
		this.shape=shape;
	}

}
