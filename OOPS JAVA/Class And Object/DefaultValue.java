class Person
{
  String name;
  int age;
  char ch;
  float mark;
  void talk()
   {
    System.out.println("Hello I am "+name);
    System.out.println("My age is "+age);
    System.out.println("My name's First letter is "+ch);
    System.out.println("My score is "+mark);
   }
}
class DefaultValue
{
    public static void main(String args[])
    {
     Person Raju=new Person();
     Raju.talk();
    }
}