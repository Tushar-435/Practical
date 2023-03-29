package Thread;

public class JoinMethod28marc extends Thread {
	public void run() {
		for(int i=1; i<3; i++) {
			try {
				Thread.sleep(400);
			}catch(Exception e) {
				System.out.println(e);
			}System.out.println(i);
		}
	}
	public static void main(String[] args) {
		JoinMethod28marc t=new JoinMethod28marc();
		JoinMethod28marc t1=new JoinMethod28marc();
		JoinMethod28marc t2=new JoinMethod28marc();
		t.start();
		try {
			t.join();
		}catch(Exception e) {
			System.out.println(e);
		}
		t1.start();
		t2.start();
	}

}
