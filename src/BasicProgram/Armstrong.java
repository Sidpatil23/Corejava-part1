package BasicProgram;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 digit Number");
		int number = s.nextInt();
		int oNumber, rem, res = 0;
		oNumber = number;
	
		while ( oNumber!=0) {
			rem = oNumber % 10;
            res += Math.pow(rem, 3);
            oNumber /= 10;
		}
		 if(res == number)
	            System.out.println(number + " is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");
	}

}
