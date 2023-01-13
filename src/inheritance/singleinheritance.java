package inheritance;
class Student {
	int sid = 10;

	void display() {
		System.out.println("roll number of sid is " + sid);
	}
}

class EnggStud extends Student { // single
	String spec = "computer";

	void displaySpec() {
		System.out.println(" Spec " + spec);
	}
}

class EnggGrade extends EnggStud {// multilevel
	int grade = 9;

	void displayG() {
		System.out.println("grade " + grade);
	}
}

class EnggClg extends Student { // multiple
	String clg = "kgce";

	void displayClg() {
		System.out.println("CLG " + clg);
	}
}

public class singleinheritance {

	public static void main(String[] args) {
		EnggStud E = new EnggStud();
		E.display();
		E.displaySpec();

		EnggClg e = new EnggClg();
		e.display();
		e.displayClg();

		EnggGrade ee = new EnggGrade();
		ee.displayG();

	}

}


