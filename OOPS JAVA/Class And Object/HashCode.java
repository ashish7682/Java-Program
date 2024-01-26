/*     Program to create person class and an object Raju to Person class. 
                 Display hashcode number using hashcode()     */
class Person
{
    String name;
    int age;
    void talk()
    {
        System.out.println("Hello I am "+name);
        System.out.println("My age is "+age);
    }
}
class HashCode
{
    public static void main(String args[])
    {
     Person Raju=new Person();
     System.out.println("Hash Code= "+Raju.hashCode());
    }
}