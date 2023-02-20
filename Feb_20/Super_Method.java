package Feb_20;

 class Shape1{ // parent class
	 void print() { // parent class method
		 System.out.println("print circle");
	 }}
 class Size1 extends Shape1{// child class
	 void print() { // same method of parent class (child class method)
		 System.out.println("print triangle");}
	 void display() { // new method of child class
		 System.out.println("print nothing");}
	 void show() {// final method
		 super.print(); // refer immediate parent method
		 display();
		 print();
	 }}
 class Super_Method{
	 public static void main(String[] args) {
		Size1 obj=new Size1();
		obj.show();
		
	}
	 }


