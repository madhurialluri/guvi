/* package whatever; // don't place package name! */
import java.util.Scanner;
class Prime
{
   public static void main(String args[])
   {		
	int temp;
	boolean isPrime=true;
	Scanner scan= new Scanner(System.in);
	int num=scan.nextInt();
        scan.close();
	for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	
	if(isPrime)
	   System.out.println("yes");
	else
	   System.out.println("no");
   }
}