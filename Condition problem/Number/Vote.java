import java.util.Scanner;
class Vote
{
    public static void main(String args[])
    {
        int age;
        System.out.print("Enter your age: ");
        Scanner obj=new Scanner(System.in);
        age=obj.nextInt();
        if(age>18)
        {
            System.out.println("You are eligible for Vote");
        }else{
            System.out.println("You are not eligible for vote");
        }
        System.out.println("Thank You");
    }
}