package BasicProgram;

public class ThisEx {
	String name;

	public ThisEx(String name) {
		super()
;
		this.name = name;
		System.out.println("Name is:-"+this);}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisEx t=new ThisEx("Siddhesh");
		System.out.println("Object t "+t.name);
		
	}

}
