
import java.util.*;

class Integer_To_Roman
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int RomanNum[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String RomanLet[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"}; 
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<RomanNum.length;i++)
		{
		    while(num>=RomanNum[i])
		    {
		        num=num-RomanNum[i];
		        sb.append(RomanLet[i]);
		    }
		}
		
		System.out.println(sb.toString());
		
		
	}
}