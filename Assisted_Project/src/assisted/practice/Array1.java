package assisted.practice;

public class Array1 {

	public static void main(String[] args) {
		   int[][] arr = { { 1, 2 }, { 3, 4 } }; 
		   
	        for (int i = 0; i < 2; i++) {                // for row
	            for (int j = 0; j < 2; j++) {            // for column
	                System.out.print(arr[i][j] + " "); 
	            } 
	            System.out.println();

	           
	        } 
	        int[][] b = {
                    {2, 4, 6, 8}, 
                    {3, 6, 9} };
              
              System.out.println("\nLength of row 1: " + b[0].length);


	}

}
