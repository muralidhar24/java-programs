class jesus
{
	public static void main(String a[])
	{
		for(int i=1; i<=14; i++)
		{
			for(int j=1; j<=13; j++)
			{
				if(i<=4 && j<=5 || j>=9 && i<=4 ||i>=8 && j<=5 || j>=9 && i>=8)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();

		}
	}
}
