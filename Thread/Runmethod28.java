package Thread;

public class Runmethod28 extends Thread{
	public void run() {
		System.out.println("THread activated");
	}
	public static void main(String[] args) {
		Runmethod28 obj=new Runmethod28();
		obj.run();
		obj.setName("Tushar");
		String s=obj.getName();
		System.out.println(s);
	}

}
