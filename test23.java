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
		int min, size, i;
		int arr[] = new int[50];
		Scanner scan = new Scanner(System.in);
		size = scan.nextInt();
		for(i=0; i<size; i++)
		{
			arr[i] = scan.nextInt();
		}
		min = arr[0];
		for(i=0; i<size; i++)
		{
		if(min > arr[i])
		{
            		min = arr[i];
		}
           
	}
	   
	System.out.print( min); 
	}
}
