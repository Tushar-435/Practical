package Thread;
// if you are extending the thread class the object is also not treated
// as a thread object we need to creat thread class object explicitly
// we are passing object of our class which implement runnable so that class run() method execute but not start()
 class RunnableInterface28 implements Runnable {
	 public void run() {
		 System.out.println("thread is runnig");
	 }
	public static void main(String[] args) {
		RunnableInterface28 ri=new RunnableInterface28();
		Thread t=new Thread(ri);
		t.start();
	}

}
