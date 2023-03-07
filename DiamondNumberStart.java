package Pattern;

public class DiamondNumberStart {
	public static void main(String[] args) {
		int n = 9;
		int st = 1;
		int sp =n-1;
		for(int i = 1;i<=n;i++)
		{
		
			for(int j = 1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			int num = (st/2)+1;
			for(int k= 1;k<=st;k++)
			{
				System.out.print(num);
				if(k<=st/2) num--;
				else num++;
			}
			System.out.println();
			if(i<=n/2)
			{
				st+=2;
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
