package Feb_20;

 class Shape { // parent class
	 String name="Circle";
 }
 class Size extends Shape {
	 String name="No size";
	 void print() {
		 System.out.println(name);
		 System.out.println(super.name);
	 }}
 class Super{
	 public static void main(String[] args) {
		Size obj= new Size();
		obj.print();
	}
	 }


