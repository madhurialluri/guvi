/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class test87
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		while(n1!=n2)
		{
			if(n1 > n2)
			n1 -= n2;
			else
			n2 -= n1;
		}
		System.out.println(n1);
	}
}
