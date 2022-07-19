package Array;

import java.util.Iterator;
import java.util.Scanner;

public class S008_MurgeArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array leength : ");
		int n = sc.nextInt();
		
		
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[a.length+b.length];
		int i;
		for( i=0;i<n;i++)
		{
			System.out.print("Enter array value : ");
			a[i]= sc.nextInt();
		}
		for( i=0;i<n;i++)
		{
			System.out.print("Enter array value : ");
			b[i]= sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			c[i] = a[i];
		}
		for(i=0;i<b.length;i++)
		{
			 c[a.length+i]=b[i];
		}
		for(i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}

}
