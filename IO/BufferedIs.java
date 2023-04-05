package IO;


	import java.io.BufferedInputStream;

import java.io.FileInputStream;

	// we can read single  character -using FileI:nputStream
	public class BufferedIs {
		public static void main(String[] args) {
			try {
				FileInputStream f= new FileInputStream("E:\\New folder (3)\\New folder\\kum.txt ");// Source path
				BufferedInputStream b=new BufferedInputStream(f);
				int i;
				while((i=b.read())!=-1) {
					System.out.print((char)i);//convert it into character
				}
				f.close();
				b.close();
			}catch(Exception e) {
				System.out.println(e);
				}
			}
		}


