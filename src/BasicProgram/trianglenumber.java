package BasicProgram;
import java.util.Scanner;
public class trianglenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number = s.nextInt();
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = number; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print( "*");
			}
			System.out.println();
		}
	}

}
	


