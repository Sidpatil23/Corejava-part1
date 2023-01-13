package inheritance;

import java.util.Scanner;

class Add {
	int a, b;
	Scanner s = new Scanner(System.in);

	void add() {
		System.out.println("a and b");
		a = s.nextInt();
		b = s.nextInt();
		int c = a + b;
		System.out.println(c);
	}
}

class Sub extends Add {
	int a, b;
	Scanner s = new Scanner(System.in);

	void subb() {
		System.out.println("a and b");
		a = s.nextInt();
		b = s.nextInt();
		int c = a - b;
		System.out.println(c);
	}

	public void mul() {
		// TODO Auto-generated method stub
		
	}

}
class Mul extends Add {
	int a, b;
	Scanner s = new Scanner(System.in);

	public Mul() {
		System.out.println("a and b");
		a = s.nextInt();
		b = s.nextInt();
		int c = a * b;
		System.out.println(c);
	}
}

public class userdefined {

	

	public static void main(String[] args) {

		Sub s = new Sub();
		s.add();
		s.subb();
		s.mul();
	}

}



