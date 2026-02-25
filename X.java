import java.util.Scanner;
class X
{
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{	
			for(int j=1; j<=n*2-1; j++)
			{
				if(i==j || j==i || (i+j)==n*2)
				System.out.print("* ");
				else
				System.out.print("  ");	
			}
			
		
			System.out.println();
		}
		for(int i=n-1; i>=1; i--)
		{	
			for(int j=1; j<=n*2-1; j++)
			{
				if(i==j || j==i || (i+j)==n*2)
				System.out.print("* ");
				else
				System.out.print("  ");	
			}
			
		
			System.out.println();
		}

		
	}
}	

	


				