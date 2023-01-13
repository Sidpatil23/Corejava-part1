package BasicProgram;

public class stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder("Siddhesh ");
		str.append("patil ");
		System.out.println(str);

		str.insert(1, "Abc ");
		System.out.println("insert " + str);
		str.replace(2, 3, "xyz");
		System.out.println("replace" + str);
		str.reverse();
		System.out.println(str);
		System.out.println("reverse" + str.capacity());
		StringBuffer sb1 = new StringBuffer();
        //printing default capacity of string buffer  
        System.out.println("sb1: default capacity: " + sb1.capacity()); 
        // current size 16+10 = 26
        StringBuffer sb2 = new StringBuffer("Welcome to");
        System.out.println("sb2: After declaration capacity: " + sb2.capacity());


	}

}
