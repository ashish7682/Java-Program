//-------------------cloning Example----------
class Employee implements Cloneable
{
    int id;
    String name;

    Employee(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    void getData()
    {
        System.out.println("Id="+id);
        System.out.println("Name="+name);
    }
    //--clone the present class object--
   public Object myClone() throws CloneNotSupportedException
   {
    return super.clone();
   }
}

class Clone
{
    public static void main(String args[]) throws CloneNotSupportedException 
    {
        
        Employee e1=new Employee(10,"Srinivas");
        System.out.println("Original object:");
        e1.getData();        

        Employee e2=(Employee)e1.myClone();
    

        System.out.println("Cloned object:");
        e2.getData();
    }
}