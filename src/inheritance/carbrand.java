package inheritance;

class car {
	String c = "4 wheeler";

	void d1() {
		System.out.println("type of car " + c);
	}
}

class Brand extends car {
	String b = "tata";

	void d2() {
		System.out.println("Brand name " + b);
	}
}

class Name extends Brand {
	String N = "nano";

	void d3() {
		System.out.println("Name of car " + N);
	}
}

public class carbrand {

	public static void main(String[] args) {
		Name nn = new Name();
		nn.d1();
		nn.d2();
		nn.d3();

	}

}
