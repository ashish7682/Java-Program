import java.util.*;
class Ca
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int key=sc.nextInt();
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
		   if((s1.charAt(i)+key)>=65 && (s1.charAt(i)+key)<=90)
		   {
		       s2=s2+(char)(s1.charAt(i)+key);
		   }
		  else if((s1.charAt(i)+key)>=97 &&((s1.charAt(i)+key)<=122))
		   {
		       s2=s2+(char)(s1.charAt(i)+key);
		   }
		    else if((s1.charAt(i)+key)>90)
		   {
		       s2=s2+(char)((s1.charAt(i)+key)-26);
		   }
		   else if((s1.charAt(i)+key)>122)
		   {
		       s2=s2+(char)((s1.charAt(i)+key)-26);
		   }
		   else if(s1.charAt(i)==' ')
		   {
		       s2=s2+" ";
		   }
		}
		System.out.println(s2);
	}
}