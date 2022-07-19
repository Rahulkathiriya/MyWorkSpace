package OpretorsInJava;

public class S004_unaryopretor {

public static void main(String[] args) {
	
		
		int a= 20;
		int b = a++ + ++a - a-- - --a;
  		      // 20 +  22 - 22  -  20;  a= 20 , b = 0;
		
		System.out.println(a);
		System.out.println(b);
		
		
		int c = 40;
		int d = --c + c-- + ++c - c++ + ++c - c++;
             //  39 + 39  +  39	- 39  + 41  - 41  
		System.out.println(c);
		System.out.println(d);
		

	}
}
