package LinkedList;

import java.util.LinkedList;

public class linkedListMethod {
	public static void main(String[] args) {
		LinkedList<String>ll=new LinkedList<String>();//create list
		ll.add("Tushar");
		ll.add("Pallabi");
		ll.add("Riya");
		ll.add("Dev");
		ll.add("Mukul");
		System.out.println("List 1 elements:"+" "+ll);
		// retrieves the 1st elements of the list by default
		System.out.println(ll.peek());
		// retrieves the 1st elements of the list
		System.out.println(ll.peekFirst());
		// retrieves the last elements of the list
		System.out.println(ll.peekLast());
		// retrieves and removes the 1st elements of the list--- by default
		System.out.println(ll.poll());
		System.out.println("List 1 elements:"+" "+ll);
		// retrieves the 1st elements of the list
		System.out.println(ll.pollFirst());
		System.out.println("List 1 elements:"+" "+ll);
		// retrieves the last elements of the list
		System.out.println(ll.pollLast());
		System.out.println("List 1 elements:"+" "+ll);
		System.out.println(ll.pop());
		System.out.println("List 1 elements:"+" "+ll);
}}
