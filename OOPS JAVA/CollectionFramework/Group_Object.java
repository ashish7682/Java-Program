import java.util.*;
class Employee
{
    int id;
    String name;

    //To store data
    Employee(int i,String n)
    {
        id=i;
        name=n;
    }
    void displayData()
    {
        System.out.println(id+"\t"+name);
    }
}
class Group_Object
{
    public static void main(String args[])
    {
      Scanner ref=new Scanner(System.in);
      Employee arr[]=new Employee[5];

      //store 5 input data
      for(int i=0;i<5;i++)
      {
        System.out.println("Enter id:");
        int id=ref.nextInt();
        System.out.println("Enter Name:");
        String name=ref.next();
        arr[i]=new Employee(id,name);
      }
      System.out.println("Employee data is:");
      for(int i=0;i<5;i++)
      {
        arr[i].displayData();
      }
    }
}