import java.io.*;
class Console_IO
{
    public static void main(String args[])
    {
        String str;
        char ch[];
        Console obj=System.console();
        System.out.print("Enter Username:");
        str=obj.readLine();
        System.out.print("Enter password:");
        ch=obj.readPassword();

        //......The password we enter that is not visible.......//
        //.......But we cannot see only print method.......//
        //..........In Print method we only see refernce of the password......//
        //.........So we see our password by valueOf() method............//

        String a=String.valueOf(ch);

        System.out.println("Username: "+str);
        System.out.print("Password: "+a);
    }
}