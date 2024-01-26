import java.util.*;
class WallPaintingCost
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double interior=sc.nextDouble();
        double exterior=sc.nextDouble();
        double[] a = new double[(int)interior];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextDouble();
        }
        double[] b = new double[(int)exterior];
        for(int i=0;i<b.length;i++)
        {
            b[i]=sc.nextDouble();
        }
        double total=0;
        double interiorCost=0;
        double exteriorCost=0;
        for(int i=0;i<a.length;i++)
        {
            interiorCost=interiorCost+(a[i]*18);
        }
        for(int i=0;i<b.length;i++)
        {
            exteriorCost=exteriorCost+(b[i]*12);
        }
        total=interiorCost+exteriorCost;
        System.out.println(total);

    }
}