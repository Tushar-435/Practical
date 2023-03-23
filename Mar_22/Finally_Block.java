package Mar_22;

public class Finally_Block {
	public static void main(String[] args) {
	//exception occur
	try {
		int a=4/2;
		System.out.println(a);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	//exception occur
	try {
		int a=4/0;
		System.out.println(a);
	}
	catch(NullPointerException e) {
		System.out.println(e);
	}
	finally {
		System.out.println("Always finally block will executwe");
	}
	}

}
