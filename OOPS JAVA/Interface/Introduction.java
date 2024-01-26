import java.util.Scanner;
interface Client
{
    void input();
    void output();
}
class Introduction implements Client
{
    String name;
    Double sal;

    public void input()
    {
        Scanner ref=new Scanner(System.in);
        System.out.println("Enter Username:");
        name=ref.nextLine();

        System.out.println("Enter salary:");
        sal=ref.nextDouble();
    }

    public void output()
    {
        System.out.println(name+" "+sal);
    }

    public static void main(String args[])
    {
        Client C=new Raju();
        C.input();
        C.output();
    }
}