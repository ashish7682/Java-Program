import java.util.*;
class TCS4
{
        void input(int A)
        {
            if(A<10)
            {
                System.out.println(A+10);
            }
            Stack<Integer> s=new Stack<>();
            for(int i=9;i>=2;i--)
            {
                while(A%i==0)
                {
                    s.push(i);
                    A=A/i;
                }
            }
            if(A<1)
            {
               System.out.println("-1") ;
            }
            int b=0;
            while(!s.empty())
            {
                int x=s.peek();
                s.pop();
                b=b*10+x;
                
            }
            System.out.println(b);
        }
        public static void main (String[] args) 
        {
            Scanner sc=new Scanner(System.in);
            int A=sc.nextInt();
            TCS4 ref=new TCS4();
            ref.input(A);
        }
    
}