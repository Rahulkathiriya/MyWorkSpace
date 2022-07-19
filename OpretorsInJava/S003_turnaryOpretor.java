package OpretorsInJava;

public class S003_turnaryOpretor {

	
	public static void main(String[] args) {
		

		int a = 33;
		int b = 21;
		int c = 56;
		
		int big = (a>b) ? ((a>c) ? a : c ): ((b>c ? b : c));
		
		System.out.println("BIG VALUE IS : "+big);

	}

	
}
