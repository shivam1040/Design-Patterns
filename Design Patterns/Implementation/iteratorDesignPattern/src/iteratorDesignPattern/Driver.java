package iteratorDesignPattern;

public class Driver {
	public static void main(String[] args) {
		NamedRepository namedRepository=new NamedRepository();
		for(Iterator iterator=namedRepository.getIterator(); iterator.hasNext();) {
			System.out.println((String)iterator.next());
		}
	}
}
