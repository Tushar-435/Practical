package Thread;
class Sthred_Test {
	synchronized void display(int num) {//with synchronization method
		for(int i=1; i<=5; i++) {
			System.out.println(num+i);
			try {
				Thread.sleep(100);}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
public class SyncronizedEg29mar {
public static void main(String[] args) {
	Sthred_Test obj=new Sthred_Test();
	// 1st thread obj t1
	Thread t1=new Thread() {
	public void run() {
		obj.display(2);
}
};
	// 2nd thread object
	Thread t2=new Thread() {
		public void run() {
			obj.display(10);
		}
	};
	t1.start();
	t2.start();
}}