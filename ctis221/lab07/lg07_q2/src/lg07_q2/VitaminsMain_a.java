package lg07_q2;

public class VitaminsMain_a {

	public static void main(String[] args) {
		Vitamins vitamins1 = new Vitamins();
		Vitamins vitamins2 = new Vitamins("B12", 65, "Eczacibasi", 1236545);
		Vitamins vitamins3 = new Vitamins("C vit++", 45, "Quali-Blends", 3576455);
		System.out.println(vitamins1.toString());
		System.out.println(vitamins2);
		System.out.println(vitamins3);

	}

}
