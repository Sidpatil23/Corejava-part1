package inheritance;

abstract class Bike1 {
	abstract void speed();
	void display() {
		System.out.println("Bike class. ");
	}
}

class MotorBike extends Bike1{

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("MotorBike. ");
	}
	
}

public class AbstractEx extends Bike1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractEx a = new AbstractEx();
	//	Bike a = new AbstractEx();
		a.display();
		a.speed();
		MotorBike m = new MotorBike();
		m.speed();
	}

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("Nice Bike. ");
	}

}