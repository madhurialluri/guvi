/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		 int i=sc.nextInt();
		int limit=sc.nextInt();
		for(int n=i+1; n<limit; n++)
		{
 		     if(n%2==0) 
			System.out.println(n+" ");
		}

	}
}
