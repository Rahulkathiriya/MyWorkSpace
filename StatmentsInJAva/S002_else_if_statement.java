package StatmentsInJAva;

import java.util.Scanner;

public class S002_else_if_statement {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter english marks : ");
		int english = sc.nextInt();
		
		System.out.print("Enter accounting marks : ");
		int accounting = sc.nextInt();
		
		System.out.print("Enter statastic marks : ");
        int statastic = sc.nextInt();
        
        int total;
        total = english + accounting + statastic;
        
        float parsentage;
        parsentage =  (float)total/3;
        
        System.out.println("TOTAL SCORE IS : "+total);
     	System.out.println("PARSENTAGE IS : "+parsentage);
		
     	
     	
     	if(english<35 || accounting<35 || statastic<35) {
     		System.out.println("YOU ARE FAIL......");
     	}
     	else if(parsentage>=90) {
        	System.out.println("YOU ARE PASS WITH A GREADE........");
        }
        else if(parsentage<90 && parsentage>=70)
        {
        	System.out.println("YOU ARE PASS WITH B GREADE........ ");
        }
        else if(parsentage<70 && parsentage>=55)
        {
        	System.out.println("YOU ARE PASS WITH C GREADE..........");
        }
        else if(parsentage<55 && parsentage>=35)
        {
        	System.out.println("YOU ARE PASS WITH D GREADE.........");
        }
       
        
	}
}
