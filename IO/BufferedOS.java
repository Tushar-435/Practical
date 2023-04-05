package IO;
//write information in the bufferedOutputstream object which is 
// connected to the FileOutPutStream object

	import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

	// write String to byte array---- write byte with file output
	public class BufferedOS {
		public static void main(String[] args) {
			try {
				// we connected one stream(FileOutputStream) with another
				FileOutputStream f=new FileOutputStream("E:\\New folder (3)\\New folder\\s.txt ");
				BufferedOutputStream b=new BufferedOutputStream(f); 
				String s="Welcome to java world dost";
				byte b1[]= s.getBytes();//converting string into byte
				f.write(b1);
				b.flush();
				f.close();
				b.close();
				System.out.println("Done");
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}



