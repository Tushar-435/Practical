package Thread;


	class MyThreadClass1 {
		synchronized void print(int num) {//with synchronization method
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
	class Thread3 extends Thread{
		MyThreadClass1  Mt;
		Thread3(MyThreadClass1  Mt){
			this.Mt=Mt;
		}
		
		public void run() {
			Mt.print(5);}}
	class Thread4 extends Thread{
		MyThreadClass1  Mt;
		Thread4(MyThreadClass1  Mt){
			this.Mt=Mt;
		}
		public void run() {
			Mt.print(2);
		}
	}
	class Thread5 extends Thread{
		MyThreadClass1  Mt;
		Thread5(MyThreadClass1 Mt){
			this.Mt=Mt;
		}
		public void run() {
			Mt.print(3);
		}
	}
	public class SynchronizeEg29mar {
		public static void main(String[] args) {
			MyThreadClass1 obj=new MyThreadClass1();
			Thread3 t=new Thread3(obj);
			Thread4 t1=new Thread4(obj);
			Thread5 t2=new Thread5(obj);
			t.start();
			t1.start();
			t2.start();
		}

	}



