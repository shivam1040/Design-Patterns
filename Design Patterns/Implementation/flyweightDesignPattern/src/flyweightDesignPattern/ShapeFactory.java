package flyweightDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
	public static final Map<String, Shape> map=new HashMap<String, Shape>();
	public static Shape get(String color) {
		Circle circle=(Circle) map.get(color);
		if(circle==null) {
			System.out.println("creating circle "+color);
			circle=new Circle(color);
			map.put(color, circle);
		}
		return circle;
	}
}
