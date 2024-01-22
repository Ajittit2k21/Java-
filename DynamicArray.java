 //dynamic input/output of 2d array
import java.util.Scanner;
public class DynamicArray{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
                  //  2x2
		//2d syntax: datatype [][]A=new Datatype[rsize][csize];
		int [][]A=new int[2][2];
		                       /*
	     Array class object
		                                 c0     c1
		                         r0    A[0][0] A[0][1]

		                         r1    A[1][0] A[1][1]
		                       */
		System.out.println("Enter 4 values of matrix:\n");
		for(int r=0;r<2;r++)
		{
			for(int c=0;c<2;c++)
			{
				A[r][c]=sc.nextInt();
			}
		}
System.out.println("\n\n\n\n 4 values of matrix:\n");
for(int r=0;r<2;r++)
				{
					for(int c=0;c<2;c++)
					{
						System.out.print(A[r][c]+"\t");
					}
					System.out.println();
    	}
	}
}
 