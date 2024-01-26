import java.util.Scanner;
class Sum1
{
    public static  void main(String args[])
    {
        int a,b,result;
        System.out.print("Enter first number:");
        Scanner ref=new Scanner(System.in);
        a=ref.nextInt();
        System.out.print("Enter Second number:");
        b=ref.nextInt();
        result=a+b;
        System.out.println("result:"+result);
    }
}