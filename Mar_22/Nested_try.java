package Mar_22;

public class Nested_try {
	public static void main(String[] args) {
		// outer try block
		try {
			// 1st inner try block
			try { 
				int n = 10/0;
				System.out.println(n);
			}
			catch (ArithmeticException e) {
				System.out.println(e);
			}
			// 2nd try block
			try {
				int arr [] = new int[3];
				int a = 5;
				arr[2] = 22;
				System.out.println(a);
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			System.out.println("Both inner try block done");
		}
		// outer catch block
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Done");
	}
}