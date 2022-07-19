package StatmentsInJAva;

import java.util.Scanner;

public class S005_fibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		
		int a=0;
		int b=1;
		
		System.out.println(a);
		System.out.println(b);
		
		int i;
		int c;
		int d;
		
		for(i=2;i<=n;i++)
		{
			d = a+b;
			a = b;
			b = d;
			System.out.println(d);
		}
		
	}

}
