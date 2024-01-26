class Person
{
  String name="venkat";
  int age=30;
  void talk()
  {
    System.out.println("hello I am "+name);
    System.out.println("My age is "+age);
  }
}
class Demo
{
    public static void main(String args[])
    {
        Person Raju=new Person();
        Raju.name="Raju";
        Raju.age=22;
        Raju.talk();
        Person Sita=new Person();
        Sita.talk();
    }

}