import java.util.*;
class HashMap_Method
{
    public static void main(String args[])
    {
        //......................Example--->Country(key),population(value).............
        HashMap<String, Integer> map=new HashMap<>();

        //....................Insertion Method...................
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);
        System.out.println(map);
       //.................We can change the value of prevoius value...............
        map.put("China",180);
        System.out.println(map);
        //..................Search Operation(Method -1).....................
        if(map.containsKey("China"))
        {
            System.out.println("Key is present in the map");
        }else{
            System.out.println("Keey is not present in the map");
        }

        System.out.println(map.get("China"));//key exists
        System.out.println(map.get("Indonessia"));//.......key does not exits t returns null....
        /*.............If key exits its returns (.contains) returns true 
                            otherwise return false.........................*/
        System.out.println(map.containsKey("China"));
        System.out.println(map.containsKey("America"));                    
    }
}