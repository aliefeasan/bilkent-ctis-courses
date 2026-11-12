package lg07_q1;

public class RadioMain_c {

	public static void main(String[] args) {
		Radio r1 = new Radio();
		Radio r2 = new Radio("Power Fm");
		Radio r3 = new Radio("Pal Fm","Nostalgia",77.7);
		Radio r4 = new Radio("Kral Fm","Pop",94.7);
		System.out.println(r3.toString());
		System.out.println(r2.toString());
		System.out.println(r1.toString());
		System.out.println(r4.toString());
		
		System.out.println(r4.getFrequency());
		r4.setFrequency(80.0);
		System.out.println(r4.getFrequency());
		
	}

}
