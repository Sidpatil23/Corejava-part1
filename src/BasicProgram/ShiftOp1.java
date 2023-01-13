package BasicProgram;

public class ShiftOp1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=3;
		String s = num%2==0 ? "even":"odd";
		System.out.println(s);

		int a = 1;
		int b = 2;
		int re = a>b? a: b;
		System.out.println("max " +re);
		
		int c =  3;
	
		
		int res = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("max "+res);
		
		int age = 2;
		String vote = age > 18 ? "Eligible to vote" : "NotEligible to vote";
		System.out.println(vote);

	}

}