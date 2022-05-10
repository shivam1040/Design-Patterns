package visitorDesignPattern;

public class Driver {
	public static void main(String[] args) {
		ComputerPart computerPart=new Computer();
		computerPart.accept(new ComputerPartDisplayVisitor());
	}
}
