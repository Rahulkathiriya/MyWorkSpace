package OpretorsInJava;

import java.util.Scanner;

public class S006_AssignmentOpretor {
	
	public static void main(String[] args) {

	
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the value of A : ");
		int a = sc.nextInt();
		System.out.print("Enter the value of B : ");
		int b = sc.nextInt();
		
		
		a*=2;
		System.out.println("After multiplication A value is : "+a);
		a/=4;
		System.out.println("After Division A value is : "+a);

		
		b+=12;
		System.out.println("After added some number B value is : "+b);
		b-=22;
		System.out.println("After Substraction b value is : "+b);

		
	}

}
