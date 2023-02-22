package Feb_21;

public class Overloadingtypepromotion { // class
	void add(int a, double b) { // method2
		System.out.println(a+b);
	}
	void add(int a,int b, int c) { // method 2
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		Overloadingtypepromotion obj=new Overloadingtypepromotion(); // obj
		obj.add(2, 3);
		obj.add(10, 30 , 40);
	}

}
