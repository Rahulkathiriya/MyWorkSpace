package Array;

import java.util.Scanner;

public class S010_MAtrix_Of_Array {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of array : ");
		int n = sc.nextInt();
		
		int a[][] = new int[n][n];
		int b[][] = new int[n][n];
		
		int i,j;
		
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("Enter Array value : ");
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Enter second matrix value");
		System.out.println();
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("Enter Array value : ");
				b[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println();
		System.out.println("----- first Matrix is----");
		System.out.println();
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("----- Second Matrix is----");
		System.out.println();
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("----- Addition of Matrix is----");
		System.out.println();
	
		int sum=0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				sum = a[i][j]+b[i][j];
				System.out.print(sum+" ");
			}
			System.out.println();
		}
	}

}
