package Pattern;

import java.util.Scanner;

public class S009_space_pattern2 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int n= sc.nextInt();
		
		int i,j,k;
		
		for(i=1;i<=n;i++)
		{
			for(k=n-1;k>=n-i;k--)
				
			{
				System.out.print("  ");
			}
			for(j=n;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=2;i<=n;i++) {
			
			for(k=1;k<=n-i+1;k++)
			{
				System.out.print("  ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
