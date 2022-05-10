package interpreterDesignPattern;

public class Driver {
	public static Expression getMaleExpression() {
	Expression robert =new TerminalExpression("Robert");
	Expression john=new TerminalExpression("John");
	return new OrExpression(robert, john);
}

	public static Expression getMarriedWomanExpression() {
		Expression julie=new TerminalExpression("Julie");
		Expression married=new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}
	
	public static void main(String[] args) {
		Expression isMale=getMaleExpression();
		Expression isMarriedWoman=getMarriedWomanExpression();
		System.out.println(isMale.interpret("John")); //interpretin data according to definition in method and returning true or false
		System.out.println(isMarriedWoman.interpret("Married Julie"));
	}
}
