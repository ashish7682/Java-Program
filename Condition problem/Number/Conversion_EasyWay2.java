import java.util.*;
import java.io.*;

class Conversion_EasyWay2 
{
	public static void main (String[] args) 
	{
	    //.....octal number
		Scanner sc=new Scanner(System.in);
		String octal=sc.nextLine();
		//.....convert to decimal
		int decimal=Integer.parseInt(octal,8);
		System.out.println(decimal);
		//.....Convert to octal
		String convert=Integer.toString(decimal,8);
		System.out.println(convert);
		
	}
}