import java.util.Scanner;
class Marks
{
    public static void main(String args[])
    {
        int n;
        float total=0;
        System.out.print("Enter no. of subject:");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        int score[]=new int[n];
        //Intialise the value
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter marks:");
            score[i]=ref.nextInt();
        }
        //find total marks

        for(int i=0;i<n;i++)
        {
           total=total+score[i]; 
        }
        System.out.println("Total Score:"+total);
        float percent;
        percent=total/n;
        System.out.println("Percentage="+percent);

    }
}