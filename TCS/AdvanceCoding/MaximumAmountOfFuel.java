// import java.util.*;
// class MaximumAmountOfFuel
// {
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int k=sc.nextInt();
//         int price[]=new int[n];
//         for(int i=0;i<price.length;i++)
//         {
//             price[i]=sc.nextInt();
//         }
//         int fuel[]=new int[n];
//         for(int i=0;i<fuel.length;i++)
//         {
//             fuel[i]=sc.nextInt();
//         }
//         int result=0;
//         for(int i=price.length-1;i>=0;i--)
//         {
//             if(price[i]<=k)
//             {
//                 result=result+fuel[i];
//                 k=k-price[i];
//             } 
//         }
//         System.out.println(result);
//     }
// }
import java.util.*;
class MaximumAmountOfFuel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int price[]=new int[n];
        for(int i=0;i<price.length;i++)
        {
            price[i]=sc.nextInt();
        }
        int fuel[]=new int[n];
        for(int i=0;i<fuel.length;i++)
        {
            fuel[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int result=0;
        for(int i=0;i<n;i++)
        {
            map.put(price[i],fuel[i]);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            int key=e.getKey();
            int value=e.getValue();
            if(key<k)
            {
               result=result+value;
               k=k-key;
            }
        }
        System.out.println(result);
    }
}