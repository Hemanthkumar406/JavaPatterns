package Pattern;

public class HollowDiamondPattern {
	public static void main(String[] args) {
		int n = 9;
		int st=1;
		int sp=n/2;
		for(int i = 1;i<=n;i++)
		{
			for(int k = 1;k<=sp;k++)
			{
				System.out.print(" ");
			}
			for(int j= 1;j<=st;j++)
			{
				String s=(i==1 || j==1 || i==n || j==st)?"*":" ";
				System.out.print(s);
			}
			System.out.println();
			if(i<=n/2)
			{	
			st +=2;
			sp -=1;
			}
			else
			{
				st -= 2;
				sp += 1;
			}
		}
	}
}
