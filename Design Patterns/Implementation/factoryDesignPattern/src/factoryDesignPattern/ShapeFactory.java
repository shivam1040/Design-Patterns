package factoryDesignPattern;

public class ShapeFactory {
	public Shape getShape(String shapeType) {
		if(shapeType==null)
			return null;
		else if(shapeType.equalsIgnoreCase("Circle"))
			return new Circle();
		else if(shapeType.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		return null;
	}
}
