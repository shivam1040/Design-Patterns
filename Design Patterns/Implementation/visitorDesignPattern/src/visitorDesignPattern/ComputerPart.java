package visitorDesignPattern;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}
