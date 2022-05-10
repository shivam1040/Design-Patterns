package abstractFactoryDesignPattern;

public class ShapeFactory extends AbstractFactory{

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Shape getShape(String shape) {
		if(shape.equalsIgnoreCase("Circle"))
			return new Circle();
		else if(shape.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		return null;
	}

}
