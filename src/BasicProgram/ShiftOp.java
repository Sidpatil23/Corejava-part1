package BasicProgram;

public class ShiftOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20;
		System.out.println("a^b = " + (a^b));  
		System.out.println("a&b = " + (a&b));  
		System.out.println("a&b " +((a<b)&&(b<a)));
		System.out.println("a|b " +((a<b)||(b>a)));
		System.out.println("a^b " +(!(a>b)));
		System.out.println(a%3==0 ? "even":"odd");
	}
}  
