import java.util.*;
class Automatic_Vending_Machine
{
    public static void main (String[] args)
    {
      Scanner sc=new Scanner(System.in);
      String c[]={"Espresso Coffee","Cappuccino Coffee","Latte Coffee"};
      String t[]={"Plain Tea","Assam Tea","Ginger Tea","Cardamom Tea","Masala Tea","Lemon Tea","Green Tea","Organic Darjeling Tea"};
      String s[]={"Hot and Sour Soup","Veg Corn Soup","Tomato Soup","Spicy Tomato Soup"};
      String b[]={"Hot Chocolate Drink","Badam Drink","Badam Pista Drink"};
      char ch=sc.next().charAt(0);
      int n=sc.nextInt();
      if(ch=='c')
      {
          for(int i=0;i<3;i++)
          {
             if(n==(i+1))
             {
                 System.out.println("Welcome to CCD!");
                 System.out.println("Enjoy Your "+c[i]+"!");
             }
             else if(n>3)
             {
                 System.out.println("Invalid Input!");
                 break;
             }
          }
      }
      else if(ch=='t')
      {
          for(int i=0;i<8;i++)
          {
             if(n==(i+1))
             {
                 System.out.println("Welcome to CCD!");
                 System.out.println("Enjoy Your "+t[i]+"!");
             }
             else if(n>8)
             {
                 System.out.println("Invalid Input!");
                 break;
             }
          }
      }
     else if(ch=='s')
      {
          for(int i=0;i<4;i++)
          {
             if(n==(i+1))
             {
                 System.out.println("Welcome to CCD!");
                 System.out.println("Enjoy Your "+s[i]+"!");
             }
             else if(n>4)
             {
                 System.out.println("Invalid Input!");
                 break;
             }
          }
      }
      else if(ch=='b')
      {
          for(int i=0;i<3;i++)
          {
             if(n==(i+1))
             {
                 System.out.println("Welcome to CCD!");
                 System.out.println("Enjoy Your "+b[i]+"!");
             }
             else if(n>3)
             {
                 System.out.println("Invalid Input!");
                 break;
             }
          }
      }
    }
}
// Input:
// c
// 1
// Output
// Welcome to CCD!
// Enjoy your Espresso Coffee!

// Example 2:
// Input:
// t
// 9
// Output
// INVALID OUTPUT!