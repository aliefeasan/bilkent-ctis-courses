package lg07_q2;

public class Vitamins {
	private String name;
	private int numberOfCapsul;
	private String brand;
	private int codeNumber;
	public Vitamins() {
		super();
	}
	public Vitamins(String name, int numberOfCapsul, String brand, int codeNumber) {
		super();
		this.name = name;
		this.numberOfCapsul = numberOfCapsul;
		this.brand = brand;
		this.codeNumber = codeNumber;
	}
	@Override
	public String toString() {
		return "Vitamins [name=" + name + ", numberOfCapsul=" + numberOfCapsul + ", brand=" + brand + ", codeNumber="
				+ codeNumber + "]";
	}
	
	
}
