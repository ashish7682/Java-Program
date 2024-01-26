import java.io.*;
class Add2
{
    public static void main(String args[])
    {
int a;
System.out.print("Enter Data");
//Scanner obj=new Scanner(System.in);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//a=obj.nextInt();
a=Integer.parseInt(br.readLine());
System.out.print("Get Data " +a);
    }
}