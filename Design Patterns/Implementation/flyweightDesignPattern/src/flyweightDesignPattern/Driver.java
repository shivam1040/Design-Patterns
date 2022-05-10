package flyweightDesignPattern;

public class Driver {
	private static final String colors[]= {"Red", "Green", "Blue", "White"};
	public static void main(String args[]) {
		for(int i=0; i<20; i++) {
			Circle circle=(Circle)ShapeFactory.get(getRandomColor());
			circle.setX(getRandom());
			circle.setY(getRandom());
			circle.draw();
		}
		System.out.println(ShapeFactory.map.size());
	}
	private static int getRandom() {
		return (int) (Math.random()*100);
	}
	private static String getRandomColor() {
		return colors[(int)(Math.random()*colors.length)];
	}
}
