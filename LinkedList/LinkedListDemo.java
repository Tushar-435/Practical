package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>(); //create list 1
		ll.add("Anudip");
		ll.add("Pallabi");
		System.out.println("After adding :");
		// adding an element at the specific pos
		ll.add(1,"Riya");
		
		LinkedList<String> ll1 = new LinkedList<String>(); //create list 2
		ll1.add("aaa");
		ll1.add("bbb");
		// adding 2nd list elements to 1st list
		ll.addAll(ll1);
		// adding 2nd elements to the 1st list at a specific position
		ll.addAll(1, ll1);
		//adding elemts at 1st position
		ll.addFirst("skill");	
		//adding elemts at 2nd position
		ll.addLast("Developoment");
		// remove specific element
		ll.remove("Pallabi");
		// removing specific element on the basis of position
		ll.remove(1);
		// remove all new elements
		ll.removeAll(ll1);
		// remove first element from list
		ll.removeFirst();
		// remove last element from list
		ll.removeLast();
		// remove First Occurrence
		ll.removeFirstOccurrence("Pallabi");
		// remove last Occurrence
		ll.removeLastOccurrence("Pallabi");
		
		// remove all elements 
		ll.clear();
		
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		// transversing the list of elements in reverse order
		Iterator i = ll.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			}
		}
	}
	}