package proxyDesignPattern;

public class RealImage implements Image {
	private String fileName;
	@Override
	public void display() {
		System.out.println(fileName);

	}
	
	public RealImage(String fileName) {
		this.fileName=fileName;
		loadFromDisk(fileName);
	}
	
	private void loadFromDisk(String fileName) {
		System.out.println("loading "+fileName);
	}

}
