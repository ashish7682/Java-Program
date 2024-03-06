import java.util.*;
class Add
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=3;
        int y=2;

        /*------Method 1-------*/

        /*while(y!=0)
        {
            int carry=x&y;
            x=x^y;
            y=carry<<1;
        }*/

        /*------Method 2-------*/

        /*while(y!=0)
        {
            x++;
            y--;
        }*/

        /*------Method 3-------*/
        
        int sum=x-(-y);
        System.out.println(sum);
    }
}