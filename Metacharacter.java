package Mar_16;

import java.util.regex.Pattern;

// meta character
// \d-[0-9]
// \s[white space character]
// \w-[a-zA-Z0-9]
public class Metacharacter {
	public static void main(String[] args) {
		boolean b3 = Pattern.matches("[\\w]{5,}","Anudip123");
		System.out.println(b3);
	}

}
