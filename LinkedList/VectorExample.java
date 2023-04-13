package LinkedList;

import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		//creating vector
		Vector<String>vc=new Vector<String>();
		// adding elements to a vector
		vc.add("Dog");
		vc.add("Cat");
		vc.add(0,"Tiger");
		// checking size & capacity
		System.out.println("Size"+vc.size());
		System.out.println("Capacity"+vc.capacity());// old cap 3/2+1
		// add more elements
		vc.addElement("Cow");
		vc.addElement("Goat");
		System.out.println("After adding Elements");
		System.out.println("Size:"+vc.size());
		System.out.println("Size:"+vc.capacity());
		// checking cat is persent in the vector or not
		System.out.println(vc);
		if(vc.contains("Cat")) {
			System.out.println("Elements present");
		}else {
			System.out.println("Elements not presents");
		}
		//getting 1st elements
		System.out.println("1st elements:"+vc.firstElement());
		// getting last elements
		System.out.println("last elements:"+vc.lastElement());
		//checking index of specified element
		System.out.println("index :"+vc.indexOf("cat"));
		}
	}

