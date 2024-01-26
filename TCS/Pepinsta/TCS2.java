import java.util.*;
class TCS2
{
    void input(int p1,int p2,int p3,int q,int e,int r)
    {
        int result2=e-r+2*q+-p1-p2-p3;
        int x=result2/3;
        int result1=x+p1-q+p3-q+q;
        System.out.println(result1);
        System.out.println(result2);
        
    }
    public static void main(String args[])
    {
      TCS2 ref=new TCS2();
      int p1=30,p2=26,p3=28,q=14,e=345,r=43;
      ref.input(p1,p2,p3,q,e,r);
    }
}