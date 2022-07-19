package Looping_statement;

import java.util.Scanner;

public class S004_even_odd_number {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		
		int i;
		int flag = 0;
		
		for(i=1;i<=n;i++)
		{
			if(i%3==0)
				
			{
				flag=1;
				i++;
			} 
		
		if(flag==1)
		{
			System.out.print(i+" ");
		}

		else if(flag!=1)		
		{		
			System.out.println(i+" ");
		}
		}
		
		
	}

}
