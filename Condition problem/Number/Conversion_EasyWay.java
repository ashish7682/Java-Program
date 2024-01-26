import java.util.*;
import java.io.*;

class Conversion_EasyWay 
{
	public static void main (String[] args) 
	{
	    //.....binary number
		Scanner sc=new Scanner(System.in);
		String binary=sc.nextLine();
		//.....convert to decimal
		int decimal=Integer.parseInt(binary,2);
		System.out.println(decimal);
		//.....Convert to binary
		String convert=Integer.toBinaryString(decimal);
		System.out.println(convert);
        
	
	}
}