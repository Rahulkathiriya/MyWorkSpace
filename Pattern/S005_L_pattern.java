package Pattern;

import java.util.Scanner;

public class S005_L_pattern {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int n= sc.nextInt();
		
		int i,j;
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
				if(i==n || j==n)
			{
				System.out.print("* ");
			}
				else {
					System.out.print("");
				}
			System.out.println();
		}
		
		
	}

}
