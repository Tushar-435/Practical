package Object;
// 3 ways to initialize object in java - By refrence variable, By method, By constructor
 class ObjectEg {
	 //Instance variable
	int id;
	String name;
	}
class Object{ //main class
	public static void main(String[] args) {
		ObjectEg obj=new ObjectEg();//create object -- obj is our ref variable
		obj.id=101;
		obj.name="Pallabi";
		System.out.println(obj.id+" "+obj.name);//printing members with a white space
	}}