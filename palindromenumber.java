import java.util.Scanner;
class palindromenumber
{
	public static void main(String a[])
	{
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int b=(n%10);
		int c=(n/10);
		int d=0;
		if(n>=0)
		{
			while(c!=0)
			{
				d = c%10;
				c=c/10;
				b=b*10+d;
			}
			if(b==n)
			{
				System.out.print("palindrome number");
			}
			else
			{
				System.out.print("not palindrome number");
			}
		}
		else
		{
			System.out.print("not palindrome number");
		}
	}
}