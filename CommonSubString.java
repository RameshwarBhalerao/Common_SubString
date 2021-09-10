package google;

import java.util.Arrays;
import java.util.Iterator;

public class CommonSubString {

	public static void main(String[] args) {

		
		String s="hel heloo hello";
		
		String a[]=s.split(" ");
		String s2="";
		
		s=a[0];
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = i+1; j <= s.length(); j++) 
			{
				String s1=s.substring(i, j);
				int k = 0;
				for (; k < a.length; k++) 
				{
					if(!a[k].contains(s1))
						break;
				}
				if(k==a.length &&s1.length()>s2.length())
					s2=s1;
			}
		}
			System.out.println(s2);
		
	}

}
