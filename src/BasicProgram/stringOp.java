package BasicProgram;

import java.util.Arrays;

public class stringOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println();	
	String s1 = new String("hello");
	String s2 = "Siddhesh";
	String s3 = "My Name is ";
	System.out.println(s1+" "+s2);
	System.out.println(s3.concat(s2));
	System.out.println("Length:"+s3.length());
	System.out.println("Substring:"+s3.substring(4,7));
	System.out.println("Upper Case:"+s2.toUpperCase());
	String s4 = "";
	System.out.println("To check a null:"+s4.isBlank());
	char[]arr = new char[10];
	s3.getChars(0, 10, arr, 0);
	System.out.println("GetChars: "+Arrays.toString(arr));
	System.out.println("Comparison: "+s1.compareTo(s2));
	System.out.println("Equals: "+s3.equals(s2));
	System.out.println("Equals: "+s3.equalsIgnoreCase(s2));
	System.out.println("Strats with: "+s2.startsWith("Ja"));
	System.out.println("Ends with: "+s1.endsWith("de"));
	System.out.println("Replace: "+s3.replace(s3, "Siddhesh Patil"));
	System.out.println("Repeat: "+s1.repeat(5));
	System.out.println("CharAt: "+s1.charAt(0));
	System.out.println("Trim: "+s3.stripLeading());
	System.out.println("Trim: "+s3.stripTrailing());

	}

}
