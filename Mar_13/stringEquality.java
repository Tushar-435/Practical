package Mar_13;


	import java.util.Scanner;
	public class stringEquality {
	public static void main(String[] args) {
		String str1,str2;
		Scanner ab = new Scanner (System.in);
		System.out.println("Enter First String");
		str1 = ab.next();
		System.out.println("Enter Second String");
		str2 = ab.next();
		//comapre two input string (java string compare)
		//if (str1.equal(str2))
		//equal()-comapre orginal content of String
		if (str1.compareTo(str2)>0) //compare
			System.out.println("Equal String");
		else
			System.out.println("Unequal Strings");
		
	}
	}

