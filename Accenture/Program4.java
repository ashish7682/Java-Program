import java.util.*;
class Program4
{
    
    int array(int arr[],int sum)
    {
        int add,mul;
        Arrays.sort(arr);
        if(arr.length<2)
        {
            return -1;
        }
        else
        {
            add=arr[0]+arr[1];
        }
        if(add<sum)
        {
            mul=arr[0]*arr[1];
        }
        else
        {
            return 0;
        }
        
        return mul;
    }
    public static void main(String args[])
    {
        int arr[]={9,8,-7,3,9,3};
        int sum=4;
        Program4 ref=new Program4();
        int s= ref.array(arr,sum);
        System.out.println(s);
        
        
    }
}