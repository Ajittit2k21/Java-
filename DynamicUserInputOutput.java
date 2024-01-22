import java.util.Scanner;

public class DynamicUserInputOutput {
    public static void main(String []args){

		Scanner sobjr=new Scanner(System.in);

		//2d syntax: datatype [][]A=new Datatype[rsize][csize];
		System.out.println("Enter row size:");

		int r=sobjr.nextInt(); //2
		System.out.println("Enter column size:");

		int c=sobjr.nextInt();//2

		int [][]A=new int[r][c]; //int[2][2]
		/*  c0    		c1
		r0  A[0][0]    A[0][1]
		
		r1  A[1][0]    A[1][1]
		*/
		System.out.println("Enter = " +r*c+" values of an Matrix:");
		 //number of rows(2)
		for( r=0;r<A.length;r++)
		{               //number of cols
                       //A[0].length(2)   A[1].length(2)
			for( c=0;c<A[r].length;c++)
           {
			   A[r][c]=sobjr.nextInt();
		   }
	   }
System.out.println(r*c + " Values of Matrix:");
	//number of rows
	 		for( r=0;r<A.length;r++)
	 		{               //number of cols

	 			for( c=0;c<A[r].length;c++)
	            {
	 				System.out.print(A[r][c]+"\t");
	 		   }
	 		   System.out.println();
	    }
    }
}
