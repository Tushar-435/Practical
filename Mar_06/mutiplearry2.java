package Mar_06;

public class mutiplearry2 {
		public static void main(String[] args) {
			// declaring 2D array
			// declear no of row=4 but column=blank
			int arr[][]=new int[4][];
			// declearing column 5+7+9=21
			arr[0]=new int [5];
			arr[1]=new int [4];
			arr[2]=new int [6];
			arr[3]=new int[2];
			// initialized the jagged array
			int count =0;
			for (int i=0; i<arr.length;i++) // row
				for (int j=0; j<arr[i].length;j++)// column
					arr[i][j]=count++;
			// print the jagged Array
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
				
			
		}

	}



