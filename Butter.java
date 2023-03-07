package ButterFlyPattern;

public class Butter {
	public static void main(String[] args) {
		int n = 5;
		int m = (n*2)-1;
		int st=1;
		int sp=m-1;
		for(int i = 1;i<=m;i++)
		{
			for(int j = 1;j<=st;j++)
			{
				System.out.print("*");
			}
			for(int k=1;k<=sp;k++)
			{
				System.out.print(" ");
			}
			for(int l=1;l<=st;l++)
			{
				//if(l != n)
				System.out.print("*");
			}
			System.out.println();
			if(i<=m/2)
			{
				sp -= 2;
				st++;
			}
			else
			{
				sp += 2;
				st--;
			}
		}
	}

}
