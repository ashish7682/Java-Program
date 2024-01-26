import java.util.*;
class Count_Distinct_Digit_Number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int count=0;
        HashSet <Integer> set=new HashSet<>();
         for(int i = n1; i <= n2; i++)
         {
        // Convert the no. to String
         String s = String.valueOf(i);
        // Convert String to set using Java Collections
        HashSet<Integer> uniDigits = new HashSet<Integer>();
        for(int c : s.toCharArray())
            uniDigits.add(c);
        // Output if condition satisfies
        if (s.length() == uniDigits.size())
        {
           count++;
        }
      }

        System.out.println(count);
    }
}