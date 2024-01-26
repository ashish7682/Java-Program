import java.util.*;
//import java.io.*;

class Calendar_Demo
{
    public static void main(String args[])
    {
       Calendar cl=Calendar.getInstance();
    
      //Display date Separetely
      System.out.println("Current date:");
      int dd=cl.get(Calendar.DATE);
      int mm=cl.get(Calendar.MONTH);
      ++mm;
      int yy=cl.get(Calendar.YEAR);
      System.out.println(dd+"-"+mm+"-"+yy);
     
    //Display time alone
    System.out.print("Current time:");
    int h=cl.get(Calendar.HOUR);
    int m=cl.get(Calendar.MINUTE);
    int s=cl.get(Calendar.SECOND);
    System.out.println(h+":"+m+":"+s);

    int x=cl.get(Calendar.AM_PM);
    if(x==0)
    {
      System.out.println("Good Morning");
    }else{
      System.out.println("Good Evening");
    }
    }
}
