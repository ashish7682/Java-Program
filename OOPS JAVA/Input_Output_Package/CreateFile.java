import java.io.*;
class CreateFile
{
    public static void main(String args[])
    {
        File f=new File("C:\\Users\\ashis\\OneDrive\\Desktop\\OOPS JAVA\\file.txt");
        try
        {
           if(f.createNewFile())
           {
            System.out.print("File Successfully Created...!");
           }
           else
           {
            System.out.print("File Already Exit...!");
           }
        }
        catch(IOException i)
        {
            System.out.println("Exception handled...!");
        }
        
    }
}