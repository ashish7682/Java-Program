import java.util.*;
class Program10
{
    int k=0,l=0;
    void input(int arr[])
    {
        int a,b;
        int x=arr.length;
        if(x%2==0)
        {
            a=b=x/2;
           
        }
        else
        {
            a=(x/2)+1;
            b=x/2;
            
        }
        int even[]=new int[a]; 
            int odd[]=new int[b];
       for(int i=0;i<arr.length;i++)
       {
           if(i%2==0)
           {
               even[k++]=arr[i];
           }
           else
           {
               
               odd[l++]=arr[i];
           }
       }
       Arrays.sort(even);
       Arrays.sort(odd);
       int result=even[even.length-2]+odd[odd.length-2];
       System.out.println(result);
       
    }
    public static void main(String args[])
    {
        int arr[]={3,4,1,7,9};
        Program10 ref=new Program10();
        ref.input(arr);
    }
}