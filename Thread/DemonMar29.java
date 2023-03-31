package Thread;

public class DemonMar29 extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("i am demon");
		}else {
			System.out.println("I am user");
		}
	}
	public static void main(String[] args) {
		DemonMar29 t=new DemonMar29();
		DemonMar29 t1=new DemonMar29();
		DemonMar29 t2=new DemonMar29();
		t.setDaemon(true);
		t2.setDaemon(true);
		t.start();
		t1.start();
		t2.start();
	}

}
