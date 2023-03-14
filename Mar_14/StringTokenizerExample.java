package Mar_14;

import java.util.StringTokenizer;

public class StringTokenizerExample { // class
	public static void my() { // my method
		StringTokenizer t= new StringTokenizer("Anudeep Foundation Skill and Devlopment Center" ," ");
		while(t.hasMoreTokens()) { // boolean method it checks if there is more tokens available or not
			System.out.println(t.nextToken(" ")); // string method it return the next token from string token
		}
		StringTokenizer st=new StringTokenizer("I am Tushar & Staying bahadurgarh");	
		while(st.hasMoreTokens()) {
		System.out.println(st.nextToken(" &"));
	}}
	public static void main(String[] args) {
		my();
	}

		}
		
		
	


