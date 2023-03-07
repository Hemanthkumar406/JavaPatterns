package ButterFlyPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FibonaciSeris {
	public static List<Integer> fibonaci(int n)
	{
		List<Integer> l = new ArrayList<>();
		int a = 0;
		int b = 1;
		int c;
		for(int i=1;i<=n;i++)
		{
			l.add(a);
			c=a+b;
			a=b;
			b=c;
		}
		return l;
	}
	public static List<Integer> com(List<Integer> l)
	{
		List<Integer> c = new ArrayList<>();
		for(int i=0;i<l.size();i += 2)
		{
			c.add(l.get(i));
		}
		for(int i=l.size()-2;i>=1;i -=2)
		{
			c.add(l.get(i));
		}
		return c;
		
	}
    
 public static void main(String[] args) {
	int n = 9;
	List<Integer> s =fibonaci(n);
	List<Integer> c=com(s);
//	System.out.println(s);
//	System.out.println(c);
	int st = 1;
	int sp= 0;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=sp;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=st;k++)
		{
			System.out.print(c.get(i-1));
		}
		System.out.println();
		if(i<=n/2)
		{
			sp +=1;
		}
		else
		{
			sp -= 1;
		}
		
	}
}   
}