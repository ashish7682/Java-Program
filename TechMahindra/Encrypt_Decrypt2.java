import java.util.*;
class Encrypt_Decrypt2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)) && s.charAt(i)!= '1')
            {
                char c=s.charAt(i);
                int num=c-'0';
                for(int j=1;j<num;j++)
                {
                    list.add(s.charAt(i-1));
                }
            }else if(s.charAt(i)=='1')
            {
                continue;
            }else
            {
                list.add(s.charAt(i));
            }
        }
        System.out.println(list.get(n-1));
        // for(char c:list)
        // {
        //     System.out.println(c);
        // }
        
        
        //input1:a1b1c3
        //input2:5
        //o/p:c
    }
}