import java.util.*;
class DoctorPatient
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        int totalIncome=0;

        for(int i=0;i<20;i++)
        {
            System.out.print("Enter value of age or to Stop press blank enter: ");
            String input=sc.nextLine();

            if(input.isEmpty())
            {
                break;
            }

            int age=Integer.parseInt(input);
            if(age>0 && age<=120)
            {
                list.add(age);
            }else
            {
                System.out.println("Invalid Input");
                i--;
            }
        }
        for(int age:list)
        {
            if(age<17)
            {
                totalIncome=totalIncome+200;
            }else if(age>=17 && age<=40)
            {
                totalIncome=totalIncome+400;
            }
            else
            {
                totalIncome=totalIncome+300;
            }
        }
        System.out.println(totalIncome);
    }
}
