package compositeDesignPattern;

public class Driver {
	public static void main(String[] args) {
		Employee ceo=new Employee("A", "ceo", 1);
		Employee headSales=new Employee("B", "head sales", 2);
		Employee headMarketing=new Employee("C", "head marketing", 3);
		Employee clerk=new Employee("D", "clerk", 4);
		Employee salesExecutive=new Employee("E", "sales executive", 5);
		ceo.add(headMarketing);
		ceo.add(headSales);
		headSales.add(salesExecutive);
		headMarketing.add(clerk);
		for(Employee headEmployee:ceo.getSubordinates()) {
			System.out.println(headEmployee);
				for(Employee employee:headEmployee.getSubordinates()) {
					System.out.println(employee);
				}
		}
	}
}
