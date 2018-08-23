/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		char d;
				Scanner sc=new Scanner(System.in);
		d=sc.next().charAt(0);
				if(d >= '0' && d <= '9')
		{
			System.out.println("Yes");
		}
		else
		{
						System.out.println("No");
		}
	}
}
