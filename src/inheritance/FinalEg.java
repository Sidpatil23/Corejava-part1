package inheritance;
class FinalClass{
	public void display() {
	    System.out.println("final class");
	  }
}

class FinalMethod extends FinalClass{
	public void display() {
	      System.out.println("final method");
	}
}

public class FinalEg extends FinalMethod{
	public final void display() {
	    System.out.println("The final method is overridden.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalEg f = new FinalEg();
		
		int AGE = 20;
		AGE = 25;
	    System.out.println("Age " + AGE);
	}
}