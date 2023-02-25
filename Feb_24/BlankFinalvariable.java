package Feb_24;

import java.security.DomainCombiner;

public class BlankFinalvariable {
	final int value ; // blank initiallization of final varaible
	BlankFinalvariable() { // default constructore
		value=70;
		System.out.println(value);
		// we can't change the value of final variable
		// compile time error
		
	}
public static void main(String[] args) {
	BlankFinalvariable fv=new BlankFinalvariable(); // creating object
}
}
