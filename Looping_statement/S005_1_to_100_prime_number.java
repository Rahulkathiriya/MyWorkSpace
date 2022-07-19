package Looping_statement;

import java.util.Scanner;

public class S005_1_to_100_prime_number {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int number = sc.nextInt();
		
		for(int i=2;i<number;i++)
		{
		
			int count=0;
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					count+=1;
				}
			}
			if(count==0)
			{
				System.out.print(i+" ");
			}
//			else {
//				
//				System.out.println(i+" Number is not prime");
//			}
		}
	}

}
