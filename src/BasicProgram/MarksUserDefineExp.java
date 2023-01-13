package BasicProgram;

class Marks{
	int marks;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	
}

class MarksException extends Exception{
	public MarksException(String m) {
		super(m);
	}
}

public class MarksUserDefineExp{

	void checkMarks(int marks) throws MarksException {
		if(marks < 0) {
			throw new MarksException("Invalid Marks");
		}
		else{
			throw new MarksException("Valid Marks");
		}
		
	}
	
	public static void main(String[] args) throws MarksException {
		// TODO Auto-generated method stub
		Marks m = new Marks();
		m.setMarks(-2);
		MarksUserDefineExp m1 = new MarksUserDefineExp();
		m1.checkMarks(m.getMarks());
		}

}