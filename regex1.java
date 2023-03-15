package Mar_15;

import java.util.regex.Pattern;
// [a-zA-z]
// [pqr]
// [^abc]
public class regex1 {
	public static void main(String[] args) {
		boolean b1=Pattern.matches("[a-zA-z]", "b");
		boolean b2=Pattern.matches("[pqr]", "q");
		boolean b3=Pattern.matches("[^abc]", "p");
		System.out.println(b1+" "+b2+" "+b3 );
	}

}
