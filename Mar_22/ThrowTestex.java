package Mar_22;

import Mar_01.Main;

public class ThrowTestex {
	//difined method
	public static void checknum(int num) {
		if(num<0) {
			throw new ArithmeticException("Number is negetive");
		}
		else {
			System.out.println("Number is positive");
		}}
		public static void main(String[] args) {
			checknum(-1);
			System.out.println("Execute");
		}
		
	}

