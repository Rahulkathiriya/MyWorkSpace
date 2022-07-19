package Array;

import java.util.Scanner;

public class S006_maxValue_array {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of Array : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		int i;
		
		for(i=0;i<n;i++)
		{
			System.out.print("Enter the value of Array : ");
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		for(i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		System.out.println();
		System.out.print("Maximum number of Array is : "+max);
	}

}
