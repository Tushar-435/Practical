package Feb_28;

interface ParentInterface {
	void show(); // by default abstract method
}
class IntefaceEg1 implements ParentInterface { // class implement interface
	@Override
	public void show() {
		System.out.println("parent interface method");
	}
	public static void main(String[] args) {
		ParentInterface obj=new IntefaceEg1();
		obj.show();
		
	}
	}
	


