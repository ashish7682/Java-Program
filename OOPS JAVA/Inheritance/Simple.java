//----------------Simple Inheritance--------
class Student
{
    int roll;
    String name;
    int mark;

    void input()
    {
        System.out.println("Enter your name , roll and mark");
    }
}
class Ashish extends Student
{
    void display()
    {
        roll=1;name="Ashish";mark=90;
        System.out.println(roll+" "+name+" "+mark);
    }
    
}
class Simple // 👈
{
    public static void main(String args[])
    {
        // Ashish r=new Ashish();
        // r.input();
        // r.display();
        System.out.println(" \"\" ");
    }
}
