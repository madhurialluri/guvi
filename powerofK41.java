/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class powerofK41
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc=new Scanner(System.in);
		     int n=sc.nextInt();
		     int a=1;
		     while(true)
		     {
			      if(a<=n)
			      {
				        if(a==n)
				        {
					         System.out.println("yes");
					         break;
				        }
				        a=a*2;
			      }
			      else
			      {
					     System.out.println("no");
					     break;
			      }
		    }
	 }
}
