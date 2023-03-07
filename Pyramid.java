package Pattern;

public class Pyramid {
	public static void main(String[] args) {
		
	
	int n = 5;
	int st = 1;
	int sp = n-1;
	for(int i = 1;i<=n;i++)
	{
		for(int j= 1;j<=sp;j++)
		{
			System.out.print(" ");
		}
		for(int k= 1;k<=st;k++)
		{
			System.out.print("*");
		}
		System.out.println();
		st += 2;
		sp -= 1;
	}
	}
}
