import java.util.*;
class Program16
{
    HashMap<Integer,Integer>map=new HashMap<>();
    void find(int arr[])
    {
        int digit=0;
        int freq=0;
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int count=map.get(arr[i]);
                map.put(arr[i],++count);
            }
            else{
                map.put(arr[i],1);
            }
            if(freq<map.get(arr[i]))
            {
                freq=map.get(arr[i]);
                digit=arr[i];
            }
            else if(freq==map.get(arr[i]))
            {
                if(digit>arr[i])
                {
                   digit=arr[i]; 
                }
            }
        }
        System.out.println(digit);
    }
    public static void main(String args[])
    {
        Program16 d=new Program16();
        int arr[]={2,1,5,2,1,2,1};
        d.find(arr);
    }
}