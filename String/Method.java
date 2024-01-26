class Method
{
    public static void main(String args[])
    {
        //....create string 3 ways.....
        String s1=" A book on Java ";
        String s2=new String("I like It.");
        char arr[]={'A','S','H','I','S','H',' ','K','U','M','A','R'};
        String s3=new String(arr);
        //......Display all the three String....
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        //.....find length of first string....
        System.out.println("Length of s1="+s1.length());
        //......concatenate two string....
        System.out.println("s1 and s2 are joined "+ s1.concat(s2));
        //.....character at any postion...
      //  char charAt(4);
         //System.out.println(+s3.charAt(4));
        //.....convert s2 into uppercase and lower case....
        System.out.println("Upper s2="+s2.toUpperCase());
        System.out.println("Lower s2="+s2.toLowerCase());
        //....remove space form first and last...
        System.out.println("After remove space:"+s1.trim());
        System.out.println(s1+" "+s3);
        
    }
}