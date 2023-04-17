package LinkedList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEg {
	// allowing null value
	public static void main(String[] args) {
		Set<String>s4=new HashSet<String>();// creatinh hashset
		s4.add("AC");// duplicate not allow
		s4.add("Pencil");
		s4.add("Mouse");
		s4.add("Phone");
		s4.add(null);// all all element
		s4.add("AC");// not allow duplicate elements
		s4.add("Bottele");
		s4.add("Earphione");
		s4.add("Pen");
		Iterator<String>itr=s4.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
