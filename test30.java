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
		Scanner sc= new Scanner(System.in);
		int sumhrs;
		int summin;
		int hours=sc.nextInt();
		int minutes=sc.nextInt();
		int nexthrs=sc.nextInt();
		int nextmin=sc.nextInt();
		
		if(hours>nexthrs){
		sumhrs=hours-nexthrs;
		}
		else{
		sumhrs=nexthrs-hours;
		}
		if(minutes>nextmin){
		summin=minutes-nextmin;
		}
		else{
		summin=nextmin-minutes;
		}
		System.out.print(sumhrs+" "+summin);
	}
}
