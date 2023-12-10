import java.util.*;
class Program2
{
   int array(int arr[])
    {
        int small,large,result;
        Arrays.sort(arr);
        if(arr.length<=3)
        {
            return 0;
        }
        else
        {
            if(arr.length%2==0)
            {
                large= arr[arr.length-4];
            }
            else
            {
                large=arr[arr.length-3];
            }
        }
        small=arr[3];
        result=small+large;
        return result;
        
    }
    
    
    
    public static void main(String args[])
    {
        int arr[]={3,2,1,7,5,4};
        GFG ref=new GFG();
       int s= ref.array(arr);
       System.out.println(s);
    }
}