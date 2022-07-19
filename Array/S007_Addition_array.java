package Array;

import java.util.Scanner;

public class S007_Addition_array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array length : ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		int b[] = new int[n];
		int sum = 0;
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter value : ");
			a[i] = sc.nextInt();
		}
		System.out.println("ENTER VALUE FOR SECOND ARRAY");
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter value : ");
			b[i] = sc.nextInt();
		}
		
		System.out.println("Addition of array ");
		for(int i=0;i<n;i++)
		{
			sum = a[i]+b[i];
			System.out.println(sum);
		}
	
	}

}
