import java.util.*;
class Question1
{
public static void main(String args[])
{
     Scanner sc=new Scanner(System.in);
     int N1=sc.nextInt();
    int N2=sc.nextInt();
    int count=0;
    while(N1!=0 && N2!=0)
    {
    if(N1>=N2)
    {
      N1=N1-N2;
      count++;
     }
     else
    {
       N2=N2-N1;
     count++;
        }
        }
        System.out.println(count);
    }
}