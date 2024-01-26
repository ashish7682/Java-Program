//----------Narrowing using super class object------------
class One
{
 void show1()
 {
    System.out.println("Super class method");
 }
}
class Two extends One
{
     void show2()
     {
        System.out.println("Sub class method");
     }
}
class Narrowing
{
    public static void main(String args[])
    {
        Two t;//--------------t is sub clas reference-------
        t=(Two)new One();// t is referring to super class object----
        //The above is narrowing----
        t.show1();
    }
}