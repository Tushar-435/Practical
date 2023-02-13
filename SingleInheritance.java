package Feb_13;



 class SingleParent { // parent class
	void show() { // parent class user defined method
		System.out.println("Show The details");
	}
}
	class   SingleChild extends   SingleParent{ // child class
		void display() { // child class user defined method
			System.out.println("display the result");
		}
	}
	public class  SingleInheritance {
		public static void main(String[] args) {
			SingleChild child = new SingleChild(); // create a object of child class
			child.display();
			child.show();
		}
	

}
