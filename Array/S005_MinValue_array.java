package Array;

import java.util.Scanner;

public class S005_MinValue_array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of array : ");
		int n = sc.nextInt();
		int i;
		int a[] = new int[n];
		for(i=0;i<n;i++)
		{
			System.out.print("Enter the value of Array : ");
			a[i] = sc.nextInt();
		}
		
		int min = a[0];
		for(i=0;i<n;i++)
			
		{
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		System.out.println();
		System.out.print("Minimum number of Array is : "+min);
		
	}

}
