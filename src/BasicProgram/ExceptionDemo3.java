package BasicProgram;

import java.util.Objects;

class Learner{										//Learner class
	private String fname,lname;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
}

class LearnerNameException extends Exception{		//Exception class
	String str;
	public LearnerNameException(String str) {
		this.str=str;
	}
	@Override
	public String toString() {
		return str;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	@Override
	public int hashCode() {
		return Objects.hash(str);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LearnerNameException other = (LearnerNameException) obj;
		return Objects.equals(str, other.str);
	}
}

public class ExceptionDemo3 {						//Main class
	static void checkName(String fname, String lname) throws LearnerNameException {
		if(fname.isEmpty() || lname.isEmpty()) {
			throw new LearnerNameException("Name cannot be blank.");
		}
		else {
			System.out.println("Name is valid.");
		}
	}
	public static void main(String[] args) {
		Learner l=new Learner();
		l.setFname("Abc");
		l.setLname("Pqr");
		try {
			checkName(l.getFname(),l.getLname());
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
