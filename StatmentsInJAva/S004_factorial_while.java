package StatmentsInJAva;

import java.util.Scanner;

public class S004_factorial_while {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter fact Number : ");
	    int n = sc.nextInt();
		int a=1;
		int fact =1;
		
		while(a<=n)
		{
			fact*=a;
			a++;

		}
		System.out.println("Factorial Number is : "+fact);
	}

}
