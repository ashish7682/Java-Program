//-----------Narrowing using sub class object------------
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
class Typecasting
{
    public static void main(String args[])
    {
        One o;
        o= new Two();  //super class reference to refer to sub class object
        Two t=(Two)o;   //This is narrowing -convert class one's refernce
        t.show1();
        t.show2();
    }
}