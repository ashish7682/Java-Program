import java.util.*;

class Longest_Common_Prefix
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		String a[]=new String[n];
		String res="";
		
		for(int i=0;i<a.length;i++)
		{
		    a[i]=sc.next();
		}
		
		if(a.length==0)
		{
		    System.out.println("");
		}else if(a.length==1)
		{
		    System.out.println(a[0]);
		}else
		{
		
		Arrays.sort(a);
		
		int end=Math.min(a[0].length(),a[a.length-1].length());

		
		//find the common prefix between  first and last String*/
		
		int i=0;
		while(i<end && a[0].charAt(i)==a[a.length-1].charAt(i))
		{
		    i++;
		}
		    String pre=a[0].substring(0,i);
		    System.out.println(pre);
		    
		}
		

		
	}
}