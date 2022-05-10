package decoratorDesignPattern;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape shape) {
		super(shape);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		super.shape.draw();
		setBorder(shape);
	}
	
	private void setBorder(Shape shape) {
		System.out.println("Border Color red");
	}

	
}
