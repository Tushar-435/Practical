package Mar_23;

import java.io.IOException;

//checked exception
class Test {
	void display() throws IOException{
		System.out.println("Throws exception perfectly");
		throw new IOException("Throws exception error");
	}
}
public class Throws_Eg {
	public static void main(String[] args) throws IOException{
		Test obj=new Test();
		obj.display();
		
	}
	

}
