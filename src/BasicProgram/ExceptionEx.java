package BasicProgram;

public class ExceptionEx {

	//public static void main(String[] args) {
	//	try {
//			int[] number = {1,2,3};
//			System.out.println(number[12]);
			
//			int a = Integer.parseInt(null);
//			System.out.println("a = "+a);
			
//			int b = Integer.parseInt("Hi");
//			System.out.println("b = "+b);
			
	//		int c = Integer.parseInt("90");
	//	}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
//		}
		
	//	catch(Exception e) {
//			System.out.println(e);
		
	//	finally {
	//		System.out.println("Finally Code");


	static void Age(int age) {
		if (age<18) {
			throw new ArithmeticException("Access denied must be above 18 years");
		}
		else {
			System.out.println("Access granted");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Age(14);
	}

}
	

