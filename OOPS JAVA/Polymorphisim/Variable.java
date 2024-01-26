//import java.util.*;
class Variable
{
    public static void main(String args[])
    {
        //Address of Variable
        int n=20;
        int x=System.identityHashCode(n);
        System.out.println(x);
        //Address of object
        Variable a=new Variable();
        Variable b=new Variable();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}