package BasicProgram;
import java.util.Scanner;

public class forloop {

	public static void main(String[] args) {
		int a , b;
		char op;
		int exit=0;
		Scanner scanner = new Scanner(System.in);
		
		while (exit==0) {
		a = scanner.nextInt();
		b = scanner.nextInt();
		op = scanner.next().charAt(0);
		switch(op) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		case '%':
			System.out.println(a%b);
			break;
		default:
			System.out.println("Invalid");	
		}
		System.out.println("1 to exit, 0 to continue");
		exit = scanner.nextInt();
		}
	        

	}

}

