package Feb_20;

 class Shape2 { // parent class
	 //constructor of parent class
	 Shape2()
	 {
		 System.out.println("Hello");
	 }}
 class Size2 extends Shape2 { // child class
	 //construction of the child class
	 Size2() {
		 // invoke immediate parent class construction line no 7
		 super();
		 System.out.println("hi");
	 }}
 class SuperCons{
	 public static void main(String[] args) {
		Size2 obj= new Size2(); // creating obj of child class
	}
	 }


