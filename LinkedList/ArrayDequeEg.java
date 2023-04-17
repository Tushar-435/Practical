package LinkedList;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEg {
	public static void main(String[] args) {
		Deque<String>dq=new ArrayDeque<String>();
		dq.add("Ram");
		dq.add("Karan");
		dq.add("Riya");
		dq.add("Priya");
		dq.add("Sam");
		dq.add("Ajay");
		// dq.add(null);// null not allow
		System.out.println(dq);
		dq.addFirst("shree");
		dq.addLast("Riya");
		System.out.println("new list");
		for (String s1 :dq) {
			System.out.println(s1);
		}
		dq.removeFirst();
		dq.removeLast();
		System.out.println("new list after removing");
		for(String s2:dq) {
			System.out.println(s2);
		}
	}

}
