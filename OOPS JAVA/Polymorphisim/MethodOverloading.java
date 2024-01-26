class MethodOverloading
{
    void add()
    {
    int a=10,b=20,c;
    c=a+b;
    System.out.println(c);
   } 

   void add(int x,int y)
   {
    int c;
    c=x+y;
    System.out.println(c);
   }

   void add(int x,double y)
   {
    double c;
    c=x+y;
    System.out.println(c);
   }
   public static  void main(String args[])
   {
    MethodOverloading ref=new MethodOverloading();
    ref.add(100,200);
    ref.add(50,32.50);
    ref.add();
   }
}


