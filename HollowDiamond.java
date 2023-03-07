package ButterFlyPattern;

public class HollowDiamond {
	public static void main(String[] args) {
		int n =5;
		int m= (n*2)-1;
		int st =1;
		int sp = m/2;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=st;k++)
			{
				String s=(i==1 || k==1 || i==m || k==st )?"*":" ";
				System.out.print(s);
			}
			System.out.println();
			if(i<m/2)
			{
				st +=2;
				sp -=1;
			}
			else
			{
				st -=2;
				sp +=1;
			}
		}
		
	}

}
