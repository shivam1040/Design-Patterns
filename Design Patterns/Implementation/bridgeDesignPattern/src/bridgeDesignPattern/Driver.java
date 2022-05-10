package bridgeDesignPattern;

public class Driver {
	public static void main(String[] args) {
		Shape redCircle=new Circle(new RedCircle(), 2, 3, 1);
		Shape greenCircle=new Circle(new GreenCircle(), 1, 2, 3);
		redCircle.draw();
		greenCircle.draw();
	}
}
