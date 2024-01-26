class Pattern5
{
    public static void main(String  args[])
    {
        int row,col;
        for(row=1;row<=5;row++)
        {
            for(col=1;col<=row;col++)
            {
                System.out.print(" "+row);
            }
            System.out.println();
        }
    }
}