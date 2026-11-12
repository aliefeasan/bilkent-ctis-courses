package lg07_q1;

public class Radio {
	private String name;
	private String type;
	private double frequency;
	public Radio() {
		super();
	}


	public Radio(String name, String type, double frequency) {
		super();
		this.name = name;
		this.type = type;
		this.frequency = frequency;
	}
	public Radio(String name, double frequency) {
		super();
		this.name = name;
		this.frequency = frequency;
	}
	

	
	@Override
	public String toString() {
		return "Radio [name=" + name + ", type=" + type + ", frequency=" + frequency + "]";
	}


	public Radio(String name) {
		super();
		this.name = name;
	}
	public double getFrequency() {
		return frequency;
	}
	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}

}
