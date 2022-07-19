package Array;

import java.util.Scanner;

public class S002_dynamic_array_user_input {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an arry number : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			
			System.out.print("Enter the value of array : "); 
			a[i] = sc.nextInt();
		}
		
		for(int b : a)
		{
			System.out.println(b);
		}
	}

}
