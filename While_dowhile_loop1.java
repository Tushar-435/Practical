package ControlStatement;

import java.util.Scanner;

public class While_dowhile_loop1 {
	public static void main(String[] args) {
		int sum =0;
		int number=0;
		
		// scanner class
		/*Scanner sc = new Scanner(System.in);//take input from user
		System.out.println("Enter the number:");
		while(true) { // add only positive number (condition)
         number = sc.nextInt();
         if(number<0)break;
			sum+=number; //sum = sum+ number
		}
		  System.out.println("sum is:"+sum);
			sc.close();
}
}*/
		Scanner sc =new Scanner(System.in);
		do {
			sum+=number;
			System.out.println("Enter the number");
			number = sc.nextInt();
		}while (number >=0);
		System.out.println("sum is:"+sum);
		sc.close();
		}
		}
