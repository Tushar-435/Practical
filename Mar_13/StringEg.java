package Mar_13;

public class StringEg {
	//char[]work same as java string
	public void show() {//method 1
		char[]arr= {'j','a','v','a'};///char type array
		String s = new String(arr);
		System.out.println("Value is :"+s);//"java"
		//java
	}
	public void myFunction() {//method 2
		String s1 = "Lucky";
		String s2 = new String(s1);
		System.out.println(s2);//Lucky
	}
	public static void main(String[] args) {
		StringEg str = new StringEg ();
		str.show();
		str.myFunction();
	}}


