package Thread;

public class ThreadExample28mr extends Thread {
	public void run() {
		System.out.println("I am thread.. i run");
	}
	public static void main(String[] args) {
		ThreadExample28mr t=new ThreadExample28mr();
		t.start(); // move to thread to the active state
		// t.start(); //
		t.setName("Tushar");
		String s=t.getName();
		System.out.println(s);
	}

}
