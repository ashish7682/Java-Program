import java.util.Scanner;
class Mark
{
    public static void main(String args[])
    {
        int marks;
        System.out.print("Enter your marks: ");
        Scanner ref=new Scanner(System.in);
        marks=ref.nextInt();
        if(marks>=80)
        {
            System.out.println("Grade A");
        }
        else if(marks<80 && marks>=60)
        {
            System.out.println("Grade B");
        }
        else if(marks<60 && marks>=45)
        {
            System.out.println("Grade C");
        }
        else if(marks>=30 && marks<45)
        {
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
    } 
}