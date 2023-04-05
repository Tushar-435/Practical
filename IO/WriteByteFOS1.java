package IO;

import java.io.FileOutputStream;

//write String to byte array---- write byte with file output
public class WriteByteFOS1 {
	public static void main(String[] args) {
		try {
			//Write byte to string
			FileOutputStream f=new FileOutputStream("E:\\New folder (3)\\New folder\\Tushar.txt ");
			f.write(65);
			f.close();
			System.out.println("Done");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
