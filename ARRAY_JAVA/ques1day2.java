import java.util.*;
class ques1day2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            double x=sc.nextDouble();
            double y=sc.nextDouble();
            solution s=new solution();
            s.checkQualification(x,y);
        }
        sc.close();
    }
}
class solution
{
    public void checkQualification(double x,double y){
    if(y<=(x*1.07))
    {
        System.out.println("YES");
    }else
    {
        System.out.println("NO");
    }
}
}