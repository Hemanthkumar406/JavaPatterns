package ButterFlyPattern;

public class DiagonalX {
	public static void main(String[] args) {
		int m =9;
		int st =m;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				String s =(i==j || i+j==m+1)?"*":" ";
				System.out.print(s);
			}
			System.out.println();
		}
	}

}
