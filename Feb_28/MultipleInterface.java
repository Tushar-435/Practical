package Feb_28;
// multiple interface-- we create multiple class/interface
interface Employee { // parent interface
	void Salary(); // abstract method salary for parent interface 1
}
interface Devloper { // parent interface 2
	void Bonus(); // abstract method Bonus for parent interface 2
}
class Trainer implements Employee,Devloper{
	@Override
	public void Bonus() {
		System.out.println("Bonus will be 10% of salary");
	}
	@Override
	public void Salary() {
		System.out.println("Salary increment");
	}}
		
public class MultipleInterface {
	public static void main(String[] args) {
		Trainer obj=new Trainer();
		obj.Bonus();
		obj.Salary();
	}

}


	



	

