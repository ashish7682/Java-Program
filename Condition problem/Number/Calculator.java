import java.util.Scanner;
class Calculator
{
    public static void main(String args[])
    {
        int a,b,ch;
        System.out.print("Enter the first number");
        System.out.print("Enter the second number");
        Scanner ref=new Scanner(System.in);
        a=ref.nextInt();
        b=ref.nextInt();
        System.out.print("Enter your choice...");
        ch=ref.nextInt();
        switch(ch)
        {
       case 1: System.out.print("add "+(a+b));
                break;
       case 2: System.out.print("sub "+(a-b));
                break;
       case 3: System.out.print("mul "+(a* b));
                break;
        case 4:System.out.print("div" +(a/b))  ;
               break;     
               default:System.out.print("Invalid choice...");
        }
        System.Out.print("Out of Switch");
    }
}