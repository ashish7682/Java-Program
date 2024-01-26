import java.util.*;
class Geo_Progression
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int c=sc.nextInt();
        int n=sc.nextInt();
        
        int r=c/b;
        int first=b/r;
        int result=first*(int)Math.pow(r,n-1);
        System.out.println(result);
        //1 3 9 27 81 243.............
        //input1-3-->2nd term
        //input2-9--->3rd term
        //input3-6--->nth term
        //o/p-243

    }
}