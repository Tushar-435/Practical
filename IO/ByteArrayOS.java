package IO;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOS {
		public static void main(String[] args) throws IOException {
				//Write byte to string
				FileOutputStream f=new FileOutputStream("E:\\New folder (3)\\New folder\\r.txt ");
				FileOutputStream f1=new FileOutputStream("E:\\New folder (3)\\New folder\\j.txt ");
				
				ByteArrayOutputStream bout =new ByteArrayOutputStream();
				bout.write(65);
				bout.writeTo(f);
				bout.writeTo(f1);
				bout.flush();
				bout.close();
				System.out.println("done");
}
}
