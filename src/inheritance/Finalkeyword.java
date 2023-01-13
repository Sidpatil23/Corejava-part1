package inheritance;

class Vehicle
{
	final  int speed = 90;
	void display()
	{
		int speed = 78;
		System.out.println("speed is:"+speed);
	}
}
public class Finalkeyword 
{

	public static void main(String[] args) 
	{
		Vehicle v = new Vehicle();
		v.display();

	}

}