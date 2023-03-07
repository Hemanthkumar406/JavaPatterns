package ButterFlyPattern;

public class NumberAlterProgram {
	public static void main(String[] args) {
		int n =5;
		for(int i=1;i<=n;i++)
		{
			if(i%2 != 0)
			{
			int num=((i-1)*n)+1;
			for(int j= 1;j<=n;j++)
			{
				System.out.print(num+"\t");
				num++;
			}
			}
			else
			{
				int num = i*n;
				for(int k=1;k<=n;k++)
				{
					System.out.print(num+"\t");
				num--;
				}
			
			}
			System.out.println();
		}
	}

}
