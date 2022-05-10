package strategyDesignPattern;

public class Driver {
	public static void main(String[] args) {
		Context context=new Context(new OperationAdd());
		System.out.println(context.executeStrategy(2, 1));
		context=new Context(new OperationSubtract());
		System.out.println(context.executeStrategy(2, 1));
	}
}
