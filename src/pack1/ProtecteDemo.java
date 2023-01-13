package pack1;
class ProtectClass{
int a=10;
protected void display() {
	System.out.println("protectedclass" +a);
}
}

public class ProtecteDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectClass p = new ProtectClass();
		p.display();
	}

}
