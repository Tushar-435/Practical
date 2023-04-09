package IO;


	import java.io.*;
	import java.io.Serializable;

	class Student implements Serializable{
		int id;
		String sname;
		int Fees;
		public Student(int id,String sname,int fees) {
			this.id = id;
			this.sname = sname;
			this.Fees = fees;
		}	
	}
	public class ObjectOutputStreamEg6Apr {
		public static void main(String[] args) {
			try {
				Student s = new Student(101, "Tushar", 2000);
				FileOutputStream fout = new FileOutputStream("E:\\New folder (3)\\New folder\\New folder\\b.txt");
				ObjectOutputStream obj = new ObjectOutputStream(fout);
				obj.writeObject(s);
				obj.close();
				System.out.println("Done");
			}
			catch (Exception e ) {
				System.out.println(e);
			}
		}	
	}


