package Looping_statement;

import java.util.Scanner;

public class S001_do_while_loop {

	public static void main(String[] args) {

		
		int choice;
		do {
			
			System.out.println("1 for addition...");
			System.out.println("2 for Substraciton");
			System.out.println("3 for  multiplication");
			System.out.println("4 for divition");
			System.out.println("0 for exit...");
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter your choice : ");
		 choice = sc.nextInt();
		

		switch (choice) {
		case 0:
		{
			System.out.println("EXIT......");
		}
		break;
		case 1: {
		
			System.out.print("Enter value of A : ");
			int a = sc.nextInt();
			
			System.out.print("Enter value of B : ");
			int b = sc.nextInt();
			
			System.out.println();
			System.out.println("Addition of "+a+" + "+b+" is : "+(a+b));
			System.out.println();
			System.out.println("--------------------------------------------------------------");
		}
		break;
		case 2: {
			
			System.out.print("Enter value of A : ");
			int a = sc.nextInt();
			
			System.out.print("Enter value of B : ");
			int b = sc.nextInt();
			
			System.out.println();
			System.out.println("Substraction of "+a+" - "+b+" is : "+(a-b));
			System.out.println();
			System.out.println("--------------------------------------------------------------");
		}
		break;
		case 3: {
			
			System.out.print("Enter value of A : ");
			int a = sc.nextInt();
			
			System.out.print("Enter value of B : ");
			int b = sc.nextInt();
			
			System.out.println();
			System.out.println("Multiplication of "+a+" * "+b+" is : "+(a*b));
			System.out.println();
			System.out.println("--------------------------------------------------------------");
		}
		break;
		case 4: {
			
			System.out.print("Enter value of A : ");
			int a = sc.nextInt();
			
			System.out.print("Enter value of B : ");
			int b = sc.nextInt();
			
			System.out.println();
			System.out.println("Divition of "+a+" / "+b+" is : "+( (float)a/b));
			System.out.println();
			System.out.println("--------------------------------------------------------------");
		}
		break;
		default:
		{
                System.out.println("Invalid choice");       
		}
		}
		
		          		
		}while(choice!=0);

	
		
	}
}
