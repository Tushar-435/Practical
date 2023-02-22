package Feb_21;

public class Overloading_changing_argdatatype {
	static int sum(int a ,int b) { /// integer type arguments
		return a+b;
	}
	static double sum(double a, double b) { // double type arguments
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println(Overloading_changing_argdatatype.sum(5, 6) );
		System.out.println(Overloading_changing_argdatatype.sum(2.5, 3.7) );
	}
	}


