package oops;

public class Studentencapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using getter setter
	/*	Student s = new Student();
		s.setRoll(12);
		s.setName("siddhesh");
		s.setCity("karjat");
		System.out.println(s.getCity());
		System.out.println(s.getName());
		System.out.println(s.getRoll());
		*/
		//using constructor
		Student s = new Student(1,"siddhesh","karjat");
		System.out.println(s.getCity());
		System.out.println(s.getName());
		System.out.println(s.getRoll());
		//now want to change value
		s.setRoll(23);
		System.out.println(s.getRoll());
		
	}

}