package OpretorsInJava;

public class S001_logicalOpretor {
	
public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		int sum  = a+b+c;
		
		
	   if (a<b && c>b)
	   {
		   
		   System.out.println("ENTER CONDITION IS TRUE AND SUM IS : "+sum);
	   }
	   
	   else {
		   
		   System.out.println("ENTER CONDITION IS FALSE");
	   }
		
//--------------------------------------------------------------------------------------------------
	   
	   if(a<b && b==c) {
		   
		   System.out.println("ENTER CONDITION IS TRUE AND SUM IS : "+sum);
	   }
	   else {
		   System.out.println("ENTER CONDITION IS FALSE");
	   }
	
	
//	===================================================================================================================
	
	
//	 * OR CONDITION *
	
	
	if(a>b || b<c)
	{
		System.out.println("ENTER CONDITION IS TRUE");
	}
	else {
		
		System.out.println("ENTER CONDTION IS FALSE");
	}
	
	
	if(a<b || b>c) {
		System.out.println("ENTER CONDITION IS TRUE");
	}
	else {
		System.out.println("ENTER CONDITION IS FALSE");
	}
	
   if(a>b || b>c) {
	   
	   System.out.println("ENTER CONDITION IS TRUE");
   }
   else {
	   System.out.println("ENTER CONDITION IS FALSE");
   }
	

	}


}
