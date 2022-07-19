package javainfo;

public class basic_information {

	
	public static void main(String[] bigening) {

		
		System.out.println("this is first java program");
		System.out.println("My Name is Rahul");
		
		
		int a  = 20;
		int b = 10;
		
		System.out.print( "ADDITION OF A & B IS : ");
        System.out.println(a+b);
        
        System.out.print( "SUBSTRACTION OF A & B IS : ");
        System.out.println(a-b);
        
        System.out.println( "MULTIPLICATION OF A & B IS : "+(a+b));
//        System.out.println(a*b);
        
        String name = "Rahul";
        
        System.out.print("MY NAME IS : ");
        System.out.println(name);
   
//---------------------------------------------------------------------------------------------------        
        
//        Widening casting  / implicite
        
        int c = 120;               //    int Size is 4 byte
        long l = c;                 //   long Size is 8 byte
        System.out.println("Widening casting value is : "+l );
        
       // widening is big to small casting
       
        
//-----------------------------------------------------------------------------        
        
        
        
       //    Nerrowing casting  / explicite 
        
        long w = 555;                  //   long Size is 8 byte
        int v = (int) w;              //    int Size is 4 byte
        System.out.println("Nerrowing casting value : "+v);
        
        // Nerrowing is big to small casting and add (int) cast remove error;
        
//------------------------------------------------------------------------------------------        
        
        int r = 'o';
        System.out.println(r);    
                                      //  show assci value in output; 
        char ch = 70;
        System.out.println(ch);
        
//----------------------------------------------------------------------------------------------        
      
	}

}
