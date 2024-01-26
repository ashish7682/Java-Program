import java.util.*;
class SweetSeventeen
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('A',10);
        map.put('B',11);
        map.put('C',12);
        map.put('D',13);
        map.put('E',14);
        map.put('F',15);
        map.put('G',16);
        map.put('a',10);
        map.put('b',11);
        map.put('c',12);
        map.put('d',13);
        map.put('e',14);
        map.put('f',15);
        map.put('g',16);
        int result=0;
        int c=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'||s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                result=result+map.get(s.charAt(i))*(int)Math.pow(17,c++);
            }
            else 
            {
                result=result+Character.getNumericValue(s.charAt(i))*(int)Math.pow(17,c++);
            }
        }
        System.out.println(result);
        
    }
}