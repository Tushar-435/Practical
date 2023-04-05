package IO;

	import java.io.FileInputStream;

	// we can read all  character -using FileI:nputStream
	public class AllCharFIs {
		public static void main(String[] args) {
			try {
				FileInputStream f= new FileInputStream("E:\\New folder (3)\\New folder\\singh.txt ");// Source path
				
				int i=0;
				while((i=f.read())!=-1) {
					System.out.print((char)i);//convert it into character
				}
				f.close();
			}catch(Exception e) {
				System.out.println(e);
				}
			}
		}





