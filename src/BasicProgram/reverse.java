package BasicProgram;
import java.util.Scanner;


public class reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String st = sc.next();
		String ts ="";
		int b = st.length();
		int c = b - 1;
		char ch;
		for (int i = 0; i <= c; i++) {
			ch = st.charAt(i);
			ts = ch + ts;
		}
		System.err.println(ts);
	}

}