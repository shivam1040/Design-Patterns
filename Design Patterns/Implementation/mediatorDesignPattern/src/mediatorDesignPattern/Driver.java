package mediatorDesignPattern;

public class Driver {
	public static void main(String[] args) {
		User robert=new User("Robert");
		User john=new User("John");
		robert.sendMessage("hello from robert");
		john.sendMessage("hello from john");
	}
}
