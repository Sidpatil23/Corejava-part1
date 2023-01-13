package pack2;

class DefaultClass {
	int a = 12;

	void display() {
		System.out.println("Default class " + a);
	}
}

class DefaultSubClass extends DefaultClass { // sub class
	void displaySub() {
		System.out.println("Default subclass ");
	}
}

public class DefaultDemo {

	public static void main(String[] args) {
		DefaultClass d = new DefaultClass();
		d.display(); // u can access inside same pakage

		DefaultSubClass ds = new DefaultSubClass();//default can also used in subclass
		ds.displaySub();
	}

}