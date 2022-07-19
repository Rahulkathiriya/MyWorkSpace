package Looping_statement;

import java.util.Scanner;

public class S002_while_loop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter factorial number : ");
		int n = sc.nextInt();
		
		int a=1;
		int fact = 1;
		
		
		while(a<=n)
		{
			fact*=a;
			a++;
		}
		System.out.println("Factorial Number is : "+fact);
		
		
		
	}

}
