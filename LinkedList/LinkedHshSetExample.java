package LinkedList;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHshSetExample {
	// allowing null methiod
	public static void main(String[] args) {
		Set<String>s=new LinkedHashSet<String>();
		s.add("AC");// duplicate not allow
		s.add("Pencil");
		s.add("Mouse");
		s.add("Phone");
		s.add(null);// all all element
		s.add("AC");// not allow duplicate elements
		s.add("Bottele");
		s.add("Earphione");
		s.add("Pen");
		Iterator<String>itr=s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
