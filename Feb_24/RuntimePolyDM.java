package Feb_24;
// run time polymorphism ant achieved by data member
public class RuntimePolyDM {
	public static void main(String[] args) {
		papa_mama object;
		object = new children();
		System.out.println(object.Priority);
	}}
class papa_mama { // base class
	String Priority="High";
}
class children extends papa_mama { // child class
	String Priority="Super_High";
	}


