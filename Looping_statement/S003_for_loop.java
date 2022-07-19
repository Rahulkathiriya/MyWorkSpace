package Looping_statement;

import java.util.Scanner;

public class S003_for_loop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter fibonacci number : ");
		int n = sc.nextInt();
		
		int a=0;
		int b=1;
		int d;
		int i;
		System.out.println(a);
		System.out.println(b);
		
		for(i=2;i<=n;i++)
		{
			d = a+b;
			a = b;
			b = d;
			System.out.println(d);
		}
		
	}

}
