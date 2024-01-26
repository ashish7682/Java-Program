import java.util.*;
class AutomaticVendingMachine
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int n=sc.nextInt();
        String coffee[]={"Espresso Coffee","Cappuccino Coffee","Latte Coffee"};
        String tea[]={"Plain Tea","Assam Tea","Ginger Tea","Cardamom Tea","Masala Tea","Lemon Tea","Green Tea","Organic Darjeeling Tea"};
        String soups[]={"Hot and Sour Soup","Veg Corn Soup","Tomato Soup","Spicy Tomato Soup"};
        String beverages[]={"Hot Chocolate Drink","Badam Drink","Badam-Pista Drink"};
        if(ch=='c')
        {
           
            for(int i=0;i<coffee.length;i++)
            {
                if(i+1==n)
                {
                    System.out.println("Welcome to CCD");
                    System.out.println("Enjoy your "+coffee[i]);
                }
            }
            if(n>coffee.length)
            {
                System.out.println("Invalid Input");
            }
        }else if(ch=='t')
        {
           
            for(int i=0;i<tea.length;i++)
            {
                if(i+1==n)
                {
                     System.out.println("Welcome to CCD");
                    System.out.println("Enjoy your "+tea[i]);
                }
            }
            if(n>tea.length)
            {
                System.out.println("Invalid Input");
            }
        }else if(ch=='s')
        {
           
            for(int i=0;i<soups.length;i++)
            {
                if(i+1==n)
                {
                     System.out.println("Welcome to CCD");
                    System.out.println("Enjoy your "+soups[i]);
                }
            }
            if(n>soups.length)
            {
                System.out.println("Invalid Input");
            }
        }else if(ch=='b')
        {
           
            for(int i=0;i<beverages.length;i++)
            {
                if(i+1==n)
                {
                     System.out.println("Welcome to CCD");
                    System.out.println("Enjoy your "+beverages[i]);
                }
            }
            if(n>coffee.length)
            {
                System.out.println("Invalid Input");
            }
        }
    }
}