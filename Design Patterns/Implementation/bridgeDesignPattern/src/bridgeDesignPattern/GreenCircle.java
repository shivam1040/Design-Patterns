package bridgeDesignPattern;

public class GreenCircle implements DrawApi {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("GreenCircl");
	}
	
}
