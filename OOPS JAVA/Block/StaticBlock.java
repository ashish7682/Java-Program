class StaticBlock
{
    
    StaticBlock()
    {
        System.out.println("3.I would be a web developer");
    }

    {
        System.out.println("2.I am a student.");
    }
    
    static
    {
        System.out.println("1.My name is Ashish");
    }

    public static void main(String args[])
    {
     StaticBlock ref=new StaticBlock();
    }
}