package Feb_25;

abstract class Parent{
	 Parent () { // cons
		System.out.println("No-args Cons");
	}
	abstract void show(); // abstract method
	void run() {
		System.out.println("No abstract method");
	}}
	class childabs extends  Parent {
		@Override
		void show() {
			System.out.println("method body");
		}}
		class AbstractMethod {
			public static void main(String[] args) {
				 Parent obj=new childabs();
				 obj.show();
				 obj.run();
				 
			}
		}
