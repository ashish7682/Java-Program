import java.util.*;
class Set_Related_Problem
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p1=sc.nextInt();
        int p2=sc.nextInt();
        int p3=sc.nextInt();
        int q=sc.nextInt();
        int e=sc.nextInt();
        int r=sc.nextInt();
        int res1=((e-r)-(p1-q+p2-q+p3-q+q));//solved exactly one of the 3 problem
        int res=res1/3;
        int res2=res+p1-q+p3-q+q;    //solved the first problem
        System.out.println(res1+" "+res2);
    }
}