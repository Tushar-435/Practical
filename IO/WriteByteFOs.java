package IO;

import java.io.FileOutputStream;

// write String to byte array---- write byte with file output
public class WriteByteFOs {
	public static void main(String[] args) {
		try {
			// Destination
			FileOutputStream f=new FileOutputStream("E:\\New folder (3)\\New folder\\04-04-23.txt ");
			String s="Welcome to java woerld";
			byte b[]= s.getBytes();//converting string into byte
			f.write(b);
			f.close();
			System.out.println("Done");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
