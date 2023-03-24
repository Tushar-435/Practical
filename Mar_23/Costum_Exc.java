package Mar_23;

class IvalidAgeException extends Exception {
	public IvalidAgeException (String str) { // constructor
		super(str);// call the constructor of parent exception
	}
}
public class Costum_Exc {
	 static void checkage(int age) throws IvalidAgeException{
		if(age<25) {
			throw new IvalidAgeException("Not eligible for java course");
		}
		else {
			System.out.println("Java course registered succesfully");
		}
	}
	
	//public static void main(String[] args) throws IvalidAgeException {
		//checked(23);
	//}}

    public static void main(String[] args) {
	try {
		checkage(23);
	}
	catch(IvalidAgeException e) {
		System.out.println(e);
	}
	}
}