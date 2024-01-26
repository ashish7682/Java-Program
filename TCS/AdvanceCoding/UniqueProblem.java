import java.util.*;
class UniqueProblem 
{
    public  static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                String sub=s.substring(i,j);
                int sum=0;
                for(int k=0;k<sub.length();k++)
                {
                    sum=sum+sub.charAt(k)-'0';
                }
                if(sum!=sub.length())
                {
                    count++;
                }
                
            }
        }
        System.out.println(count);
    }
}