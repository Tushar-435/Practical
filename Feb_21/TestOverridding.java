package Feb_21;

 class TestOverridding {
	 void run() { // method 1
		System.out.println("runnig mode one");
	 }}
 // creating child class/ sub class
 class Overidding extends TestOverridding {
	 // defining same name method as its declared in the parent class
 void run() { //  method 2
	 System.out.println("runnig mode off");
 }
 public static void main(String[] args) {
	// creating a object off child class
	 Overidding a=new Overidding();
	 a.run();
}
	 }


