package Feb_13;

public class MultilevelInheritance {
	// main class
	public static void main(String[] args) {
		SIChild2 child = new SIChild2();  // create a object of child class
	child.display();
	child.show();
	child.print();
	}
}
class SIParent1 { // parent class
	void show(){ // parent class user defined method
		System.out.println("show the detail");
	}
}
// child class of SIParent & parent class of SIchild2
class SIChild1 extends SIParent1{
	void display() {// child class user defined method
		System.out.println("display the result");
	}
}
//child class of SIParent & parent class of SIchild2
class SIChild2 extends SIChild1{
	void print() {// child class user defined method
		System.out.println("Print the result");
	}
}
