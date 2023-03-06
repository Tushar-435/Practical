package Mar_06;

public class Add3d {
	public static void main(String[] args) {
		int a[][]= {{1,2,4},{3,4,2},{1,2,4}}; // matrix 1
			int b[][]= {{1,5,2},{3,5,4},{5,6,7}}; // matrix 2
	// create new matrix for storing result(addition) 	
		int c[][]=new int [3][3];
	// logic for printing row and column	
			for (int i=0;i<3;i++) { // for printing row
			for (int j=0;j<3;j++) { // for printing column
	// logic for matrix sum			
		c[i][j]=a[i][j]+b[i][j];
		System.out.print(c[i][j]+" ");
			}
		System.out.println();
	}
	}}



/*public static void main(String[] args) {
	//create matrix
	int a[][]= {{7,9,2},{1,8,0},{1,0,9}};
	 for(int i=0; i<3; i++) {
	      // inner loop for column
	      for(int j=0; j<3; j++) {
	    System.out.print(a[i][j] + " ");
	      }
	      System.out.println(); // new line
	    }}}*/