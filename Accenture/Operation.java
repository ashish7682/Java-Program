import java.util.*;
class Operation
{
    int operation(int c,int a,int b)
    {
        int result;
        if(c==1)
        {
            result= (a+b);
        }else if(c==2)
        {
            result= (a-b);
        }else if(c==3)
        {
            result= (a*b);
        }
        else if(c==4)
        {
            result= (a/b);
        }
        return result;
    }
    public static void main (String[] args) {
        /* code */
        int a=12;
        int b=16;
        int c=1;
        Operation ref=new Operation();
        int result=ref.operation(c,a,b);
        System.out.println(result);
       
        
    }
}