package bridgeDesignPattern;

public class Circle extends Shape{
	private int x, y, radius;
	
	

	public Circle(DrawApi drawApi, int x, int y, int radius) {
		super(drawApi);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}



	@Override
	public void draw() {
		super.drawApi.drawCircle(radius, x, y);
		
	}

}
