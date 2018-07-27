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
		System.out.println("enter num1,num2,num3:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		if((num1>num2)&&(num1>num3))
		System.out.println(num1);
		else if((num2>num1)&&(num2>num3))
		System.out.println(num2);
		else
		System.out.print(num3);
	}
}
