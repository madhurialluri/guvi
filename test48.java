/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int count=0,i,res=0;
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2[]=new int[n1];
		for(i=0;i<n1;i++)
		{
			n2[i]=s.nextInt();
		}
		for(i=0;i<n1;i++)
		{
			count=count+n2[i];
		}
			res=count/n1;
			System.out.print(res);
		}
		}
