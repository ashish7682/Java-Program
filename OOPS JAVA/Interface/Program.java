interface CustomerRaj
{
    int amt=5;
    void purchase();
}

class SellerSanju implements CustomerRaj  
{
    @Override
    public void purchase()
    {
        System.out.println("Raju needs"+ amt + "kg rice");
    }
}

class Program
{
    public static void main(String args[])
    {
        CustomerRaj C=new SellerSanju();
        C.purchase();
        //System.out.println(CustomerRaj.amt);
    }
}