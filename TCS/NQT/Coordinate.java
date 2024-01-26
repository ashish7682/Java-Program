import java.util.*;
class Coordinate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //Left or Right or Up or Down
        char c='R';
        int x=0,y=0;
        int distance=10;
        while(n!=0)
        {
            switch(c)
            {
                case 'R':
                    x=x+distance;
                    distance=distance+10;
                    c='U';
                    break;
                case 'U':
                    y=y+distance;
                    distance=distance+10;
                    c='L';
                    break;
                case 'L':
                    x=x-distance;
                    distance=distance+10;
                    c='D';
                    break;
                case 'D':
                    y=y-distance;
                    distance=distance+10;
                    c='A';
                    break;
                case 'A':
                    x=x+distance;
                    distance=distance+10;
                    c='R';
                    break;
            }
            n--;
        }
        System.out.println(x+" "+y);
    }
}