/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class factorial2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		  int i,fact=1;
		  Scanner sc=new Scanner(System.in);
		  int num=sc.nextInt();
		  for(i=1;i<=num;i++)
		  {
		     fact=fact*i;
		  }
		  System.out.println(+fact);
	}
}
