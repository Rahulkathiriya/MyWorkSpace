package StatmentsInJAva;

import java.util.Scanner;

public class S001_if_else_stament {


	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of A : ");
		int a = sc.nextInt();
		
		System.out.print("Enter the value of B : ");
		int b = sc.nextInt();
		
		
		if(a>b) {
			System.out.println("Big value is : "+a);
		}
		else {
			System.out.println("Big value is : "+b);
		}
//================================================================================================
		
		System.out.print("Enter the value of C : ");
		int c = sc.nextInt();
		
		System.out.print("Enter the value of D : ");
		int d = sc.nextInt();
		
		System.out.print("Enter the value of E : ");
		int e = sc.nextInt();
		
		
		if(c>d) {
		 if (c>e)
		{
			 System.out.println("Big value is : "+c);
		}
		 else {
			 System.out.println("Big value is : "+e);
		 }
		}
		else {
			if(d>e) {
				System.out.println("Big value is : "+d);
			}
			else {
				System.out.println("Big value is : "+e);
			}
		}	
//=================================================================================================
		
		
		char alphabet = 'a';
		
		boolean rk;
		
		rk = (alphabet == 'a' || alphabet == 'e'|| alphabet == 'i'|| alphabet == 'o'|| alphabet == 'u'|| alphabet == 'A'|| alphabet == 'E'|| alphabet == 'I'|| alphabet == 'O'|| alphabet == 'U');
		
		if(rk)
		{
			System.out.println("Alphabet is a vowel.....");
		}
		else {
			
			System.out.println("Alphabet is not a vowel......");
		}
	}
}
