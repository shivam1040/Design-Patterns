package bridgeDesignPattern;

public class RedCircle implements DrawApi {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("RedCircle");
	}

}
