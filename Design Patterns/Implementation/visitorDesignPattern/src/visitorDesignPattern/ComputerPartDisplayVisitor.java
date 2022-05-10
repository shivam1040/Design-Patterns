package visitorDesignPattern;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("Keyboard");
	}

	@Override
	public void visit(Monitor monitor) {
		System.out.println("Monitor");
	}

	@Override
	public void visit(Computer computer) {
		System.out.println("Computer");
	}

	

}
