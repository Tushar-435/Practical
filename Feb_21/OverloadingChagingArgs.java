package Feb_21;

public class OverloadingChagingArgs {
	static int sum( int a , int b ) { // two parameters/arguments
		return a+b ;
	}
	static int sum(int x, int y , int z, int c) { // three argument
		return x+y+z+c;
	}
	public static void main(String[] args) {
		System.out.println( OverloadingChagingArgs.sum(5,6));
		System.out.println(OverloadingChagingArgs.sum(2,3,4,1));
	}
	}


