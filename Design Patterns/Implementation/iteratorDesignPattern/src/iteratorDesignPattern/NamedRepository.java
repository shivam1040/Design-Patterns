package iteratorDesignPattern;

public class NamedRepository implements Container {
	public String names[]= {"A", "B", "C", "D", "E"};
	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator{
		
		int index=0;
		
		@Override
		public boolean hasNext() {
			if(index<names.length)
				return true;
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext())
				return names[index++];
			return null;
		}
	}

}
