package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<String>set=new HashSet<String>();// creatinh hashset and add elements
		set.add("Ram");// duplicate not allow
		set.add("Rima");
		set.add("shyam");
		set.add("Ram");
		set.add("Ramesh");
		System.out.println("Original list:"+set);
		// removing specific elements from hashset
		set.remove("Ram");
		System.out.println("After invoke remove:"+set);
		HashSet<String>set1=new HashSet();// set2
		set1.add("Pallabi");
		set1.add("Rahul");
		System.out.println("New set:"+set1);
		set.addAll(set1);
		System.out.println("Updated list:"+set);
		// remove all the new elements
		set.removeAll(set1);
		// remove all
		// remove all 
		set.clear();
		System.out.println("Present list : "+set);
}

}


