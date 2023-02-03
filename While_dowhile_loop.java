package ControlStatement;

import java.util.Scanner;

// find out the sum of positive number
public class While_dowhile_loop {
public static void main(String[] args) {
	int sum =0;
	int number=0;
	
	// scanner class
	Scanner sc = new Scanner(System.in);//take input from user
	// take input from user
	System.out.println("Enter the number");
	int number1=sc.nextInt();
	while(number>=0) { // add only positive number (condition)
		sum+=number; //sum = sum+ number
		System.out.println("Enter the number");
		number =sc.nextInt();
	}
	System.out.println("sum is:"+sum);
	sc.close();
	
}
}
