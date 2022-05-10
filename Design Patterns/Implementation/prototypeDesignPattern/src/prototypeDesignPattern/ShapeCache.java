package prototypeDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
	private static Map<String, Shape> shapeMap=new HashMap<String, Shape>();
	
	public static Shape getShape(String shapeId) throws CloneNotSupportedException {
		Shape cachedShape=shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}
	
	public static void loadCahce() {
		Shape rectangle=new Rectangle();
		rectangle.setId("1");
		shapeMap.put(rectangle.getId(), rectangle);
		Shape square=new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);
	}
}
