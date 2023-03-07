package ButterFlyPattern;

public class DiamondHollow {
	public static void main(String[] args) {
		int n = 10;
		int m =(n*2)-1;
		int st = n;
		int sp=0;
		for(int i = 1; i<=m;i++)
		{
			for(int j=1;j<=st;j++)
			{
				System.out.print("*");
			}
			for(int k=1;k<=sp;k++)
			{
				System.out.print(" ");
			}
			for(int a=1;a<=st;a++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<=m/2)
			{
				st -=1;
				sp +=2;

			}
			else 
				{
				st +=1;
				sp -=2;
				}
			
		}
	}

}

