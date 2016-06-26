// Write a code using loops to print following pattern. 
// 1 
// 12 
// 123 
// 1234 
// 12345 
// 1234 
// 123 
// 12
// 1


package Class2_assignments;

public class class2_assignment3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row, col, nc = 5;
		
		for (row = 1; row < nc; row++)
		{
			System.out.println();
			for (col = 1; col <= row; col++)
			  	System.out.print(col + "");
		}	
		for (; row >= 1; row--)
		{
			System.out.println();
			for (col = 1; col <= row; col++)
			  	System.out.print(col + "");
		}
	}

}
