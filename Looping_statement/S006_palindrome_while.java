package Looping_statement;

import java.util.Scanner;

public class S006_palindrome_while {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		  int r,sum=0,temp;    
		  System.out.print("Enter Number : ");
		  int n = sc.nextInt();
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;   
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println(temp+" is palindrome number ");    
		  else    
		   System.out.println(temp+" is not palindrome number");  
				
	}

}
