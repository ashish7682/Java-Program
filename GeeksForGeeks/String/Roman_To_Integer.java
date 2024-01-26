import java.util.*;
class Roman_To_Integer
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        //craete a empty hash map
        
        HashMap<Character,Integer> map=new HashMap<>();
        
        //putting value in HashMap
        
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
         // Creating integer variable to store result.
        int result = 0;
 
        // initialize loop to iterate in string.
        for (int i = 0; i < s.length(); i++) {
 
        // Checking that current element is not smaller then previous
            if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
                result += map.get(s.charAt(i))  - 2 * map.get(s.charAt(i - 1));
            }
            else {
                result += map.get(s.charAt(i));
            }
        }
        System.out.println(result);
        
    }
}