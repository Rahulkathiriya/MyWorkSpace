package Array;

import java.util.Scanner;

public class S009_MultidimationalArry {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length fo array : ");
		int n = sc.nextInt();
		
		System.out.print("Enter the length fo array : ");
		int m = sc.nextInt();
		
		int a[][] = new int[n][m];
		
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print("Enter array value : ");
				a[i][j] = sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
