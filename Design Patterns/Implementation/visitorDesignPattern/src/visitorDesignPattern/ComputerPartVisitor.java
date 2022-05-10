package visitorDesignPattern;

public interface ComputerPartVisitor {

	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
	public void visit(Computer computer);

}
