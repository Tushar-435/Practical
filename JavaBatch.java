package Object;
//how to define a class & field (data members/variable)
public class JavaBatch {
	int id;
	String Bname;
	public static void main(String[] args) {
		// create object
		JavaBatch jb=new JavaBatch();
		JavaBatch jb1=new JavaBatch();
		//print value
		jb.id=1;
		jb.Bname="C4119";
		jb1.id=2;
		jb1.Bname="C2554";
		System.out.println("Id is:"+jb.id+" "+"Batch Name is:"+ jb.Bname);
		System.out.println("Id is:"+jb.id+" "+"Batch Name is:"+ jb1.Bname);
	}

}