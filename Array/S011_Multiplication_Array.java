package Array;

import java.util.Scanner;

public class S011_Multiplication_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Enter the length of array : ");
		int n = sc.nextInt();
		
		int a[][] = new int [n][n];
		int b[][] = new int [n][n];
		int c[][] = new int [n][n];
		
		int i,j,k;
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("Enter Array value : ");
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.println("-----Enter Second Matrix value----");
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
		System.out.println("-----First Matrix is----");
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
		System.out.println("-----Second Matrix is----");
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
		System.out.println("-----Multiplication of Matrix is----");
		System.out.println();
		
		int sum = 0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				sum=0;
				for(k=0;k<n;k++)
				{
					sum = sum + a[i][k]*b[k][j];
				}
				c[i][j] = sum;
			}
		}
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
