package Feb_4;

import java.util.Scanner;

public class Method {
	public static void main(String[] args) {
		// create scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		// Read number from user
		int num=sc.nextInt();
		//call the method
		findevenodd(num);
	}
	//create a method
	public static void findevenodd(int num) {
		if(num%2==0) {
			System.out.println(num + " " + "Even");
		}
		else {
			System.out.println(num + " "+ "odd");
			
		}
	}
}
