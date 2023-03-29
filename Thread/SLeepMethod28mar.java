package Thread;

public class SLeepMethod28mar extends Thread {
	public static void main(String[] args) {
		try {
			for(int i=0; i<=5; i++) {
					Thread.sleep(800);
					// thread sleep(-800) its show a error exception
					System.out.println(i);
		}
	}catch(InterruptedException e) {
		System.out.println(e);
	}

}}
