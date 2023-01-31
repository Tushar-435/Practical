package ControlStatement;

public class Switch1 {
	public static void main(String[] args) {
		char ch='a';
		switch (ch){
		case 'd':
			System.out.println("first case excute");
			break;
		case 'b':
			System.out.println("second case excute");
			break;
		case 'a':
			System.out.println("third case excute");
			break;
		case 'l':
			System.out.println("fourth case excute");
			break;
			default:System.out.println("Invalid");
		}
	}
}