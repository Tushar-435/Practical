package Thread;


	class B{
		int i;
		synchronized void display(int i) {
			this.i = i;
			System.out.println("Data displayed: "+i);
		}
		synchronized int receive() {
			System.out.println("Data recieved: "+i);
			return i;
		}
	}
	class Thread6 extends Thread{
		B obj;
		Thread6(B obj){
			this.obj = obj;
		}
		public void run() {
			for (int j=1; j<=10; j++) {
				obj.display(j);
			}
		}
	}
	class Thread8 extends Thread{
		B obj;
		Thread8(B obj){
			this.obj = obj;
		}
		public void run() {
			for (int j=1; j<=10; j++) {
				obj.receive();
			}
		}
	}
	public class Inter_Thread_Com3Apr {
		public static void main(String[] args) {
			B obj = new B();
			Thread6 t = new Thread6(obj);
			Thread8 t1 = new Thread8(obj);
			t.start();
			t1.start();
		}
	}


