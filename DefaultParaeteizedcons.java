package MethodEg;

public class DefaultParaeteizedcons {
	int age;
	String name;
	DefaultParaeteizedcons(int a, String b){
		age=a;
		name=b;
	}
	void show(){
		System.out.println(age+ " "+name);
	}
	public static void main(String[] args) {
		DefaultParaeteizedcons A=new DefaultParaeteizedcons(21,"Tushar");
		DefaultParaeteizedcons B=new DefaultParaeteizedcons(21,"Mukul");
		DefaultParaeteizedcons C=new DefaultParaeteizedcons(21,"Sourav");
		DefaultParaeteizedcons D=new DefaultParaeteizedcons(21,"Aman");
	A.show();
	B.show();
	C.show();
	D.show();
	}}
	