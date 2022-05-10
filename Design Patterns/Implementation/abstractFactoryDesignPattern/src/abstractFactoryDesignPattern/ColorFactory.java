package abstractFactoryDesignPattern;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		if(color.equalsIgnoreCase("Red"))
			return new Red();
		else if(color.equalsIgnoreCase("Blue"))
			return new Blue();
		return null;
	}

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
