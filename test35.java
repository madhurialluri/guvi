/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class test35
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int count=0,i;
		Scanner s=new Scanner(System.in);
		String c=s.nextLine();
		for(i=0;i<c.length();i++)
		{
			if(c.charAt(i)>='0'&&c.charAt(i)<='9')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}