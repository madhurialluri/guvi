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
		Scanner Input= new Scanner(System.in);
    String s =Input.nextLine();
    int index = s.length();
    boolean isVowel= true;
    isVowel = vowels(s,index);
	}
	public static boolean vowels(String s,int index){
    String small=s.toLowerCase();
    String large = s.toUpperCase();
    char z=s.charAt(s.length()-1);
    if (s==small) {
        large = s.toUpperCase();
        if(s==large){
        }
        for (int i = 0; i < s.length(); i++) {
            if (z=='a'||z=='e'||z=='i'||z=='o'||z=='u') {
                System.out.println(" yes");
                return true;
            } else if(z!='a'||z!='e'||z!='i'||z!='o'||z!='u'){
                System.out.println("no");    
                return false;
            }
        }
    }
    return true;
    }
}
