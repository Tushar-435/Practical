package MethodEg;

public class DefaultValue1 {
// display default value
		//class
		int age;
		String name;
		void show() { // methods to display age and name ( user defined)
			System.out.println(age+" "+name);}
		public static void main(String[] args) {
			 DefaultValue1  d = new  DefaultValue1 ();
			 DefaultValue1  d1 = new  DefaultValue1 ();
			d.show();
			d1.show();
			 DefaultValue1  d3 = new  DefaultValue1 ();
			d3.age = 100;
			d3.name = "Java" ;
			System.out.println(d3.age+d3.name);
		}

		
	}

	

