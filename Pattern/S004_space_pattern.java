package Pattern;

public class S004_space_pattern {

	public static void main(String[] args) {

		
		int n=7;
		
		int i,j,k;
		
		for(i=1;i<=n;i++)
		{
			for(k=n-1;k>=n-i;k--)
			{
				System.out.print("  ");
			}
			for(j=n;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
