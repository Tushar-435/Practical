package Thread;

public class Sleepmerthodeg228mar extends Thread {
	public void run() {

	    for(int i=0; i<=5; i++) {
			try {
				Thread.sleep(800);} // thread will be sleep 800 mili sec
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}}
	public static void main(String[] args) {
		 Sleepmerthodeg228mar t=new  Sleepmerthodeg228mar();
		 Sleepmerthodeg228mar t1=new  Sleepmerthodeg228mar();
		 t.start();
		 t1.start();

}}
