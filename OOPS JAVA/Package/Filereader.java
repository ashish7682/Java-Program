import java.Lang.System;
import java.Lang.String;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
class Filereader
{
    public static void main(String args[])
    {
        try{
            File r=new File("C:\Users\ashis\OneDrive\Desktop");
            Scanner ref=new Scanner(r);
            while(ref.hasNextLine())
            {
                System.out.println(ref.hasNextLine());
                System.out.println(ref.NextLine());
                System.out.println(ref.hasNextLine());
            }
        }catch(IOException e)
        {
            System.out.println("Exception Handled.....");
        }
    }
}