package Mar_22;

public class Throw_key {
	public static void check(int marks) {
		if(marks<60) {
			//throw instance=throw keyword new and then checked
			throw new ArithmeticException("Student id not eligible");
		}
		else {
			System.out.println("Student is eligible for course");
		}
	}
	public static void main(String[] args) {
		check(60);
	}
	}

