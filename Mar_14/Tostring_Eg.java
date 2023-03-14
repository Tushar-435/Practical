package Mar_14;

public class Tostring_Eg { // class
	int rollno; // integer type variable
	String name,addr; // string
	Tostring_Eg(int rollno,String name, String addr) {
		this.rollno= rollno;
		this.name= name;
		this.addr=addr;
	}
	public String toString() { // return object to string
		// return super.toString(); // obj to string
		return rollno+" "+name+" "+addr;
	}
	public static void main(String[] args) {
		Tostring_Eg s1=new Tostring_Eg(1,"Ram","Mubai"); // return the hashcode value of an obj
		Tostring_Eg s2=new Tostring_Eg(1,"karan","Delhi");
		
		System.out.println(s1); // compiler write s1.tostring()
		System.out.println(s2);
			
		}
		
	}
	
