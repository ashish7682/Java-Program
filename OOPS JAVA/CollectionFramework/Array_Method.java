import java.util.*;
import java.util.*;

class Array_Method
{
    public static void main(String args[])
    {
        Scanner ref=new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int n=ref.nextInt();
        int arr[]=new int[n];
        //...............Entre the Array element...................
        System.out.println("Enter Array element: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=ref.nextInt();
        }
        //.........Arrange the element in ascending order..........
        Arrays.sort(arr);
        System.out.println("After Arrange the element:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        //............Arrange the element form particular staring point to end point........
       /* Arrays.sort(arr,2,5);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }*/

        //.....................Find postion(index) of of any element in an array.......
        int index=Arrays.binarySearch(arr,40);
        System.out.println("position: "+index);
    
    }
}