package Pattern;

public class DownPyramid {
	public static void main(String[] args) {
		int n = 5;
		int m = (n*2)-1;
		int st = m;
		int sp =0;
		for(int i = 1; i<=m;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=st;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			st -= 2;
			sp += 1;
		}
	}

}
