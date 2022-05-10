package prototypeDesignPattern;

public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException {
		ShapeCache.loadCahce();
		Shape cloneRectangle=ShapeCache.getShape("1");
		System.out.println(cloneRectangle.getType());
		Shape cloneSquare=ShapeCache.getShape("2");
		System.out.println(cloneSquare.getType());
	}
}
