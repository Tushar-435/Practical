package Feb_13;

class SIParenteg1 { // parent class
	int salary =30000; // parent class member
}
public class SIChildeg1 extends SIParenteg1 {
	int bonus = 1500; // child class member
	int  annualsal=salary+bonus;
	public static void main(String[] args) {
		SIChildeg1 object = new SIChildeg1();
		System.out.println("Salary is : "+object.salary);
		System.out.println("Annual salary is : "+object.annualsal);
	}


	}

