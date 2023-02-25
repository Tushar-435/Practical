package Feb_24;
// final keyword
// final variable--- cannot be change the value of final variable
public class Finalvariable {
	final int value=50; // final variable
	void display() {
		System.out.println(value);
		// we can't change the value of final variable
		// value=70; // compile time error
	}
	public static void main(String[] args) {
		Finalvariable fv=new Finalvariable();
		fv.display();
	}
	}


