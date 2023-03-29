package Thread;

public class RunnableInterface28eg implements Runnable {
		 public void run() {
			 System.out.println("thread is runnig");
		 }
		public static void main(String[] args) {
			// creating objct of runnableinterfaceEg2
			RunnableInterface28eg ri=new RunnableInterface28eg();
			// creating object of thread class using tread(Runnable ref var,string name)
			Thread t=new Thread(ri, "Tushar");
			t.start();
			String s= t.getName();
			System.out.println(s);
		}

	}