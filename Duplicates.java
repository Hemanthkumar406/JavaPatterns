package ButterFlyPattern;

import java.util.HashSet;
import java.util.List;

public class Duplicates {
	public static void main(String[] args) {
		String s="aabbdefkk";
		HashSet<Character> l = remove(s);
		System.out.println(l);
	}
	public static HashSet<Character> remove(String s)
	{
		HashSet<Character> l = new HashSet<>();
		for(char c:s.toCharArray())
		{
			if(!l.add(c))
			{
				l.remove(c);
			}
		}
		return l;
	}

}
