import java.util.Scanner;
public class TextClass11 {
    //dynamic input/output of 2d array

	public static void main(String []args){

		Scanner sobjr=new Scanner(System.in);

		//2d syntax: datatype [][]A=new Datatype[rsize][csize];
		int [][]A=new int[3][4];
		System.out.println("Number of rows"+A.length);
		System.out.println("No. of cols in row1:"+A[0].length);
		System.out.println("No. of cols in row2:"+A[1].length);
		System.out.println("No. of cols in row3:"+A[2].length);
		System.out.println("Enter 12 values of an Array:");
						//number of rows
		for(int r=0;r<A.length;r++)
		{               //number of cols

			for(int c=0;c<A[r].length;c++)
           {
			   A[r][c]=sobjr.nextInt();
		   }
	   }
//number of rows
	 		for(int r=0;r<A.length;r++)
	 		{               //number of cols

	 			for(int c=0;c<A[r].length;c++)
	            {
	 				System.out.print(A[r][c]+"\t");
	 	   }
	 		   System.out.println();
	}
}
}
