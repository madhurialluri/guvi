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
		Scanner sc=new Scanner(System.in);
		String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN"};
		int n,string;
		n=sc.nextInt();
		{
			if(n<=10)
			System.out.print(ones[n]);
		}
	}
}
