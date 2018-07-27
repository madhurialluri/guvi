/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int j=sc.nextInt();
		int n[]=new int[6];
		int sum=0;
		int k=sc.nextInt();
	             for(int i=0;i<j;i++)
	    {
	    	n[i]=sc.nextInt();
	    	
	    }
                         for(int i=0;i<k;i++)
	     {
	     	sum=sum+n[i];
	     }
	     System.out.println(sum);
		
	}
}
