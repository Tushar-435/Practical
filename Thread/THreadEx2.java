package Thread;
// directly we use thread class without extends
// with & without set name we can name the thread

public class THreadEx2 {
	public void run() {
		System.out.println("tushar");
	}
public static void main(String[] args) {
	// creating an object of the thread class using the thread constructor
	Thread t=new Thread("pallabhi");
	Thread t1=new Thread();
	// THreadEx2 obj=new THreadEx2();
	// obj.run();
	t.start();
	t1.start();
	t1.setName("Raj");
	System.out.println("Thread0:"+t.getName());
	System.out.println("Thread 1:"+t1.getName());
}
}
