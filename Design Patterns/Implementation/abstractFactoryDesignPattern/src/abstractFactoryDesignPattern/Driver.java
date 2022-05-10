package abstractFactoryDesignPattern;

public class Driver {
	public static void main(String[] args) {
		AbstractFactory shapeFactory=FactoryProducer.getFactory("Shape");
		Shape shape1=shapeFactory.getShape("Circle");
		shape1.draw();
		shape1=shapeFactory.getShape("Rectangle");
		shape1.draw();
		
		AbstractFactory colorFactory=FactoryProducer.getFactory("Color");
		Color color1=colorFactory.getColor("Red");
		color1.fill();
		color1=colorFactory.getColor("Blue");
		color1.fill();
	}
}
