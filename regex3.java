package Mar_15;

import java.util.regex.Pattern;

// quantifiers
//x? - x occour once or not at all
// x+ -- x  occour once or morwe then one 
// x* - x occour zero or more time
// x{n} - x occour n time
// x{7} on;y 7 time
// x{n,} - x occour n or more time x{7,} only 7 or more
// 
public class regex3 {
	public static void main(String[] args) {
		boolean b7 = Pattern.matches("[A-Za-z0-9]{8,}", "Anudip123ppp");
		System.out.println(b7);
		boolean b8 = Pattern.matches("[A-Za-z0-9.-@]{19,}", "Pallabi.Anudip@2023");
		System.out.println(b8);
		boolean b9 = Pattern.matches("[0-9]{10}", "7400300798");
		System.out.println(b7);
		boolean b5 = Pattern.matches("[6789]{1}[0-9]{9}", "7400300798");
		System.out.println(b7);
	}

}
