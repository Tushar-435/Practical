package IO;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterExample05apr {
	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("E:\\New folder (3)\\New folder\\a.txt ");
			fw.write("Welcome to the java world");
			FileReader fr=new FileReader("E:\\New folder (3)\\New folder\\a.txt");
			int i=0;
			while((i=fr.read())!=-1) {
				System.out.println((char)i);
			}
			fw.close();
			fr.close();
			System.out.println("done");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
