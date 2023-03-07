package Pattern;

public class PyramidNumber {

	public static void main(String[] args) {
		int n = 5;
		int st = 1;
		int sp = n-1;
		for(int i = 1 ; i<=n;i++)
		{
			int num = st;
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k = 1;k<=st;k++)
			{
				System.out.print(num);
				num -=1;
			}
			System.out.println();
			st +=2;
			sp -= 1;
		}
		

	}

}
