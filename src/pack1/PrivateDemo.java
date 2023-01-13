package pack1;

class PrivateClass {
	private int a = 10;

	private void displayA() {
		System.out.println("private method " + a);
	}
}


public class PrivateDemo {

	public static void main(String[] args) {
		PrivateClass p = new PrivateClass();
		//System.out.println(p.a);
		//p.displayA();//scope of private within the class so cant access it form aonther class
	}

}