package Feb_28;

interface Shape1 {
	void shape_name();
}
class User_Circle implements Shape1 {

	@Override
	public void shape_name() {
		System.out.println("shape of a circle");
		
	}
}
class User_Triangle implements Shape1 {

	@Override
	public void shape_name() {
		System.out.println("shape of a Triangle");
		
	}}
public class Interface2 {
	public static void main(String[] args) {
		Shape1 obj=new  User_Triangle();
		obj.shape_name();
	}
	


}
