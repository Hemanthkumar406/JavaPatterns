package Pattern;

public class RightArrow {

	public static void main(String[] args) {
		int n = 5;
		int m = (n*2)-1;
		int st = 1;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=st;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<=m/2)
			{
				st += 1;
			}
			else st -= 1;
		}
		

	}

}
