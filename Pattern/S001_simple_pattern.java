package Pattern;

import java.util.Scanner;

public class S001_simple_pattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		int i,j;
		
		for(i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
				if(j==1 || j==i)
			{
				System.out.print("* ");
			}
				else {
					System.out.print("  ");
				}
			System.out.println();
		}

		for(i=1;i<=n;i++)
		{
			for(int k=n-1;k>=n-i;k--)
			{
				System.out.print(" ");
			}
			for(j=n-1;j>=i;j--)
				if(j==n-1 || j==i)
			{
				System.out.print("* ");
			}
				else {
					System.out.print("  ");
				}
			System.out.println();
		}
		
		
	}

}
