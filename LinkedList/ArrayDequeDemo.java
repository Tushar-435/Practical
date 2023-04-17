package LinkedList;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
	public static void main(String[] args) {
		// creating queue
		Deque<String> dq =new ArrayDeque<String>();
		// adding elements to queue
		dq.add("Mukul");
		dq.add("Preet");
		dq.add("Saurav");
		dq.add("Tushar");
		dq.add("Aman");
		dq.offerFirst("Kunal");
		System.err.println("After offer first :");
		// traversing
			for (String s :dq) {
				System.out.println(s);
			}
		dq.offerLast("Shayam");
		System.err.println("After offer last :");
		// traversing
		for (String s1 :dq) {
			System.out.println(s1);
		}
	// dq.peek and dq.peekFirst both as same as peek	
		System.out.println("Peek :"+dq.peek());
		System.out.println("Peek first :"+dq.peekFirst());
		System.out.println("Peek last :"+dq.peekLast());
		System.out.println("After peek : ");
		for (String s1 :dq) {
			System.out.println(s1);
		}
	// dq.poll and dq.pollFirst both as same as peek
		System.out.println("Poll :"+dq.poll());
		System.out.println("Poll first :"+dq.pollFirst());
		System.out.println("Poll last :"+dq.pollLast());
		System.out.println("After poll : ");
		for (String s2 :dq) {
			System.out.println(s2);
		}
	}
}