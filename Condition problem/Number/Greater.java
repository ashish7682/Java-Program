/*Write a program to find a greater number using condtion*/
import java.util.Scanner;
class Greater
{
 public static void main(String args[])
 {
int a,b,c;
System.out.print("Enter three numbers:");
Scanner ref=new Scanner(System.in);
a=ref.nextInt();
b=ref.nextInt();
c=ref.nextInt();
if(a>b)
{
    if(a>c)
    {
        System.out.print("a=" +a);
    }
    else
    {
        System.out.print("c=" +c);
    }
}
else
{
if(b>c)
{
    System.out.print("b=" +b);
}
else
{
    System.out.print("c=" +c);
}
}
 }
}