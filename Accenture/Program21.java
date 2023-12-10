import java.util.*;

class Program21
{
     int array(int a[])
    {
      HashSet<Integer> hash=new HashSet<>();
      for(int i=0;i<a.length;i++)
      {
        hash.add(a[i]);
      }
      int result=0;
      if(hash.size()==1)
      {
        return -1;
      }
      else
      {
        int newHash[]=new int[hash.size()];
        int j=0;
        for(Integer i:hash)
        {
            newHash[j++]=i.intValue();
        }
        Arrays.sort(newHash);
         result=newHash[newHash.length-2];
      }
      return result;
    }
    public static void main(String args[])
    {
        int a[]={4,7,9,8,0};
        Program21 ref=new Program21();
       int res= ref.array(a);
       System.out.println(res);
    }
}