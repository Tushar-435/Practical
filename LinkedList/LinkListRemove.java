package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListRemove {
	public static void main(String[] args) {
		LinkedList<String>ll=new LinkedList<String>();//create list
		ll.add("Tushar");
		ll.add("Pallabi");
		ll.add("Riya");
		ll.add("Dev");
		ll.add("Mukul");
		System.out.println("List 1 elements:"+" "+ll);
		LinkedList<String>ll2=new LinkedList<String>();//create list 2
		ll2.add("kunal");
		ll2.add("sarita");
		ll2.add("Tiya");
		System.out.println("List 2 elements:"+" "+ll2);
		// adding new elements to the list 1
		ll.addAll(ll2);
		System.out.println("After adding new elements:"+" "+ll);
		//
		ll.remove("Niladri");
		System.err.println("After removing :"+" "+ll);
		//
		ll.remove(1);
		System.out.println("After removing from specific position:"+" "+ll);
		//
		ll.removeAll(ll2);
		System.err.println("After removing all new elements:"+" "+ll);
		//
		ll.removeFirst();
		System.out.println("After removing 1st elements:"+""+ll );
		//
		ll.removeLast();
		System.out.println("After removing last elements:"+" "+ll  );
		// adding new elements to the 1 list
		ll.add("Tushar");
		ll.add("Pallabi");
		ll.add("RiyaRaj");
		ll.add("Devdas");
		ll.add("Nakul");
		System.out.println("updated list elements:"+" "+ll);
		// remove first occurrence of elements
		ll.removeFirstOccurrence("Tushar");
		System.out.println("remove first occurrence:"+" "+ll);
		// remove last occurrence
		ll.removeLastOccurrence("Nakul");
		System.out.println("remove last occurrence:"+" "+ll);
		// traversing the list of elements in reverse order
		Iterator i=ll.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());}
		// remove all the elements
		ll.clear();
		Iterator<String>itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
