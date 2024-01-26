import java.util.Scanner;
class Insert
{
    public static void main(String args[])
    {
        int i,size,loc,item;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        size=r.nextInt();
        int  a[]=new int[size+1];
        System.out.print("Enter Array Element:");
       for( i=0;i<a.length;i++)
        {
            System.out.print(""+a[i]);
        }
        System.out.print("Enter Array Location:");
        loc=r.nextInt();
        System.out.print("Enter new Item:");
        item=r.nextInt();
        for( i=size;i>loc;i--)
        {
            a[i]=a[i-1];
        }
        a[loc]=item;
        size++;
        for( i=0;i<a.length;i++)
        {
            System.out.print(""+a[i]);
        } 
 

    }
}