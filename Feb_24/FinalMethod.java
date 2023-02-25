package Feb_24;
// final keyword ---
// final method-- cannot not be override the method
class FinalMethod1 { // parent class
	final void display() { // create final method
		System.out.println("This is the final method");
	}}
class Child1 extends FinalMethod1 { // child class name main
	// try to overriding final method
	// public final void display () {
		//System.out.println("The final method is overridden");
	}
   public class FinalMethod {
	public static void main(String[] args) {
		Child1 obj=new Child1();
		obj.display();
	}
	}


