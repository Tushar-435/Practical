package LinkedList;

import java.util.LinkedHashSet;

public class LinkedHashsetEg {
	public static void main(String[] args) {
		// creating hashset and adding elements
		LinkedHashSet<String>set =new LinkedHashSet<String>();
		set.add("two");
		set.add("one");
		set.add("three");
		set.add("four");
		set.add("five");
		System.out.println("original list:"+set);
		// removing specific elements from the above mentioned list
		System.out.println(set.remove("two"));
		System.out.println("upload list:"+set);
		// six is not present
		// return false
		System.out.println(set.remove("six"));
	}

}
