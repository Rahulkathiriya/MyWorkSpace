package Pattern;

import java.util.Scanner;

public class S007_diamond_pattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		
		
		int i,j;
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=1;i<=n;i++)
		{
			for(j=n-1;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
