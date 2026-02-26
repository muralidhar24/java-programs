import java.util.*;
class twosum
{
	public static void main(String args[])
        { 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter target value:");
		int tar = sc.nextInt();
		System.out.println("enter array elements:");
		int[] a = new int[5];
		for(int k=0; k<5; k++)
		{
			a[k] = sc.nextInt();
		}
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				int b = a[i]+a[j];
				if(b==tar)
				{
					System.out.println("index is   "+i+" "+j);
				}
			}
		}
	}
}

	