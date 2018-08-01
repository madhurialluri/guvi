import java.util.*;
class even
{
	public static void main(String Args[])
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
		
