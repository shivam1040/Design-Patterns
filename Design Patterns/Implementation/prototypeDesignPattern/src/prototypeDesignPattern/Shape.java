package prototypeDesignPattern;

public abstract class Shape implements Cloneable {
	private String id, type;
	abstract public void draw();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
