/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class reversenum3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		   Scanner read=new Scanner(System.in);
		   String str=read.nextLine();
		   String reverse="";
		   for(int i = str.length()-1;i>=0;i--)
		   {
            reverse=reverse+str.charAt(i);
		   }
		   System.out.println(reverse);
	}
}
