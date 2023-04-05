package IO;

import java.io.FileInputStream;

// we can read single  character -using FileI:nputStream
public class SingleCharFIS {
	public static void main(String[] args) {
		try {
			FileInputStream f= new FileInputStream("E:\\New folder (3)\\New folder\\raj.txt ");// Source path
			// read Single character
			int i=f. read();{
				System.out.println((char)i);
			}
			f.close();
		}catch(Exception e) {
			System.out.println(e);
			}
		}
	}


