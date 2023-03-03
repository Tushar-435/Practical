package Mar_02;

public class ArrayEg3 {
		public static void main(String[] args) {
			int a[]=new int[5]; // declaration & instantiation
			// initialization
			a[0]=2;
			a[1]=4;
			a[2]=5;
			a[3]=6;
			a[4]=3;
			for(int i=0; i<a.length;i++) // length is one of the property of an array
				System.out.println(a[i]);
			// traversing an array(printing one after NOTHER) an arry using for each loop
			//for(int i:a)
			//	System.out.println(i);
			
		}

	}





