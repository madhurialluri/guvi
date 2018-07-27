import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		ch=sc.next().charAt(0);
		System.out.println("enter any character");
		if(ch== 'a' || ch== 'e' || ch== 'i' || ch=='o'|| ch=='u')
		System.out.println("given character is vowel");
		else 
		System.out.println("given character is constant");
	}
}
