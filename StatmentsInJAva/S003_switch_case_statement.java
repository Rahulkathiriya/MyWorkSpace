package StatmentsInJAva;

import java.util.Scanner;

public class S003_switch_case_statement {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter value of A : ");
		int a = sc.nextInt();

		System.out.print("Enter value of B : ");
        int b = sc.nextInt();
		
		System.out.println("chose 1 for addition:");
		System.out.println("chose 2 for multiplication:");
		System.out.println("chose 3 for substraction:");
		System.out.println("chose 4 for division:");
		System.out.println("chose 5 for modular value:");

		System.out.print("ENTER YOUR CHOICE : ");
		int choise = sc.nextInt();
		
		switch(choise)
		{
		
		case 1:
		{
            System.out.println("ADDITION OF "+a+" + "+b+" is : "+(a+b));
		}
		 break;
		case 2:
		{
            System.out.println("MULTIPLICATION OF "+a+" * "+b+" is : "+(a*b));
		}
		 break;
		case 3:
		{
            System.out.println("SUBSTRACTION OF "+a+" - "+b+" is : "+(a-b));
		}
		 break;
		case 4:
		{
            System.out.println("DIVISION OF "+a+" / "+b+" is : "+((float) a/b));
		}
		 break;
		case 5:
		{    
            System.out.println("MODULAR VALUE OF "+a+" % "+b+" is : "+(a%b));
		}
		 break;
		
		default:
		{
			System.out.println("INVALID CHOISE..!!!!!!!!!!");
		}
		 break;
		}
		
		
	}
}
