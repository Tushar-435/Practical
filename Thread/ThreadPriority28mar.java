package Thread;

public class ThreadPriority28mar extends Thread{
	public void run() {

	    for(int i=0; i<=5; i++) {
			try {
				Thread.sleep(800);}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}}
	public static void main(String[] args) {
		ThreadPriority28mar t=new ThreadPriority28mar();
		ThreadPriority28mar t1=new ThreadPriority28mar();
		ThreadPriority28mar t2=new ThreadPriority28mar();
		t2.setPriority(MAX_PRIORITY);
		System.out.println(t2.getPriority());
		System.out.println(Thread.currentThread().getPriority()+" "+Thread.currentThread().getName());
		t.start();
		t1.start();
		t2.start();
		t1.setName("Riya");
		System.out.println(t1.getName());

}
}