package BasicProgram;

public class stringopbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("Siddhesh ");
		str.append("patil ");
		System.out.println(str);

		str.insert(1, "Abc ");
		System.out.println("insert " + str);
		str.replace(2, 3, "xyz");
		System.out.println("replace" + str);
		str.reverse();
		System.out.println(str);
		System.out.println("reverse" + str.capacity());



	}

}
