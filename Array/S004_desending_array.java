package Array;

import java.util.Scanner;

public class S004_desending_array {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of Array : ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		int i,j;
		
		for(i=0;i<n;i++)
		{
			System.out.print("Enter the value of array : ");
			a[i] = sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
            for(j=i;j<n;j++)
		{
			if(a[i]<a[j])
			{
				a[i] = a[i]*a[j];
				a[j] = a[i]/a[j];
				a[i] = a[i]/a[j];
			}
		}
            System.out.print(a[i]+" ");
		}
	}

}
