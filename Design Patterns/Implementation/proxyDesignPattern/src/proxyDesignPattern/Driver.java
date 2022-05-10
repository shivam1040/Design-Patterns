package proxyDesignPattern;

public class Driver {
	public static void main(String[] args) {
	Image image=new ProxyImage("a");
	image.display();
	image.display(); //at this point no object will be created for RealImage, and display will show previously instantiated obj
	}
}
