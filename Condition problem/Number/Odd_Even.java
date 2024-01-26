import java.util.Scanner;
class Odd_Even
{
    public static void main(String args[])
    {
int number;
System.out.print("Enter any number: ");
Scanner ref=new Scanner(System.in);
number= ref.nextInt();
if(number%2==0)
{
   System.out.print("Even number");
}else{
    System.out.print("Odd number");
}
    }
}