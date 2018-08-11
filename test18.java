/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class test18
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
				Scanner sc = new Scanner(System.in);
				int number1,number2,n;
				 number1 = sc.nextInt();
				 number2 = sc.nextInt();
				 n=0;
				for (int j=number1 ; j<=number2 ; j++)
        		{
					int sum=0;
					int d=0;
					n=j;
					while (n>0)
					{
						d= n%10;
						sum=sum+d*d*d;
						n=n/10;
					}
					if (sum==j)
					{
						System.out.println(j +" ");
					}
				}
			}
			catch (Exception e)
			{
				System.out.println("Error");
			}
 
        }
}
