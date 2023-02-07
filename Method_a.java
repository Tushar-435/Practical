package Feb_4;

import java.util.Scanner;

public class Method_a {
	public static void main(String[] args) {
		
		// create scanner class
		int num,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		// Read number from user
		int n = sc.nextInt();
		//call the method
		findprime(n);
	}
	//create a method
	 static void findprime(int num) {
		 int count=0;
		 for(int i=1;i<=num;i++)
		if(num%1==0) {
			count++;}
	 if(count==2) {
			System.out.println("num is prime");
		}
		else {
			System.out.println("num is not  prime");
			
		}
	}
}


