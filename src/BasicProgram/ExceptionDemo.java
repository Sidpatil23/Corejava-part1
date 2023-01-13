package BasicProgram;



class Exception1{
	
}
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10, b = 0;
			int c = 10/0;
			System.out.println("Value of c: "+c);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Block");
		}
	}

}