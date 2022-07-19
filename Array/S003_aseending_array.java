package Array;

import java.util.Scanner;

public class S003_aseending_array {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter Array length : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		int i,j;
		
		for(i=0;i<n;i++)
		{
				System.out.print("Enter Arrey index value : ");
				arr[i] = sc.nextInt();
		}
		
		for(i=0;i<n;i++) {
			
			for(j=i;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					arr[i] = arr[i]*arr[j];
					arr[j] = arr[i]/arr[j];
					arr[i] = arr[i]/arr[j];
				}
				
			}
			System.out.print(arr[i]+" ");
		}
		
	}

}
