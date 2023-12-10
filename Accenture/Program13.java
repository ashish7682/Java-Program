import java.util.*;
class Program13
{
    void array(int arr[])
    {
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        System.out.println(max);
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]==max)
           {
               System.out.println(i);
           }
        }
        
    }
    public static void main(String args[])
    {
        int arr[]={23,45,82,27,66,12,78,13,71,86};
        Program13 ref=new Program13();
        ref.array(arr);
    }
}