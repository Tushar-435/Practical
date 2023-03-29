package Thread;

public class CurrentThreadName28March extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		CurrentThreadName28March obj=new CurrentThreadName28March();
		CurrentThreadName28March obj1=new CurrentThreadName28March();
		obj.start();
		obj1.start();
	}

}
