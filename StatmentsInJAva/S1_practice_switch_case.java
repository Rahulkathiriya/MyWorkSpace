package StatmentsInJAva;

import java.util.Scanner;

public class S1_practice_switch_case {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("CHOCE 1 FOR CIRCLE AREA :");
		System.out.println("CHOSE 2 FOR RECTANGLE AREA :");
		System.out.println("CHOCE 3 FOR TRIANGE AREA : ");
		System.out.print("ENTER YOUR CHOICE : ");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		
		case 1:
		{
			float pi = 3.14f;
			System.out.print("Enter circle radius value : ");
			int radius = sc.nextInt();
			
			System.out.println("Area of circle is : "+(pi*radius*radius));
			
		}
		 break;
		case 2:
		{
			System.out.print("Enter rectangle length : ");
			int length = sc.nextInt();
			
			System.out.print("Enter rectangle width : ");
			int width = sc.nextInt();
			
			
			System.out.println("AREA OF RECTANGLE IS : "+(length*width));
		}
		 break;
		
		case 3:
		{
			System.out.print("Enter triangle base value : ");
			int base = sc.nextInt();
			
			System.out.print("Enter triangle heigth value : ");
			int heigth = sc.nextInt();
			
			System.out.println("AREA OF TRIANGLE IS : "+(0.5*base*heigth));
		}
		 break;
		
		default:
		{
			System.out.println("INVALID CHOICE..!!!!!!!!");
		}
		 break;
		
		}
		
	}

}
