package LinkedList;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEg {
	public static void main(String[] args) {
		PriorityQueue<String>queue=new PriorityQueue<String>();
		queue.add("Prakash");
		queue.add("Babai");
		queue.add("Sankar");
		queue.add("Hashan");
		queue.add("Bumba");
		queue.add("Tanmoy");
		System.out.println("head:"+queue.element());
		System.out.println("Queue:"+queue);
		System.out.println("head:"+queue.peek());
		System.out.println("Queue:"+queue.peek());
		System.out.println("Iterating the elements");
		Iterator itr=queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());}
		System.out.println("head:"+queue.poll());
		System.out.println("queue:"+queue);
		System.out.println("head:"+queue.remove());
		
		System.out.println("Queue : "+queue);
		System.err.println("After removing : ");
		Iterator<String> itr1 =  queue.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}
		
