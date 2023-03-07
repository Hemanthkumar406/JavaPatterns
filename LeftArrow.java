package Pattern;

public class LeftArrow {

	public static void main(String[] args) {
		int n = 5;
		int m = (n*2)-1;
		int st = 1;
		int sp = m/2;
		for(int i = 1;i<=m;i++)
		{
			for(int j = 1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k = 1;k<=st;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<=m/2)
			{
				st += 1;
				sp -= 1;
			}
			else
			{
				st -= 1;
				sp += 1;
			}
		}

	}

}
