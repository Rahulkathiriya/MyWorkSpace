package Pattern;

import java.util.Scanner;

public class S003_third_pattern {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		
		int i,j;
		
		for(i=1;i<=n;i++)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
