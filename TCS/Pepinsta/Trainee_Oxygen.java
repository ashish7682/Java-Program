import java.util.*;
class Trainee_Oxygen
{
	public static void main (String[] args)
	{
	   Scanner sc=new Scanner(System.in);
	   int a[]=new int[9];
	   for(int i=0;i<3;i++)
	   {
	       if(a[i] < 1 || a[i] > 100)
	       {
   				 a[i] = 0;
   			}
	   }
	   for(int i=0;i<9;i++)
	   {
	       a[i]=sc.nextInt();
	   }
	   int max=0;
	   int Avg1=(int)(a[0]+a[3]+a[6])/3;
	   int Avg2=(int)(a[1]+a[4]+a[7])/3;
	   int Avg3=(int)(a[2]+a[5]+a[8])/3;
	   int b[]=new int[3];
	   b[0]=Avg1;
	   b[1]=Avg2;
	   b[2]=Avg3;
	   //Arrays.sort(b);
	   //int max=b[2];
	   for(int i = 0; i < 3; i++) 
	   { if(b[i] > max) {
   			 max = b[i];
   		 }
	   }
	   for(int i=0;i<3;i++)
	   {
	       if(max==b[i])
	       {
	           System.out.println("Trainee Number"+(i+1));
	       }
	       if(b[i]<70)
	       {
	           System.out.println("Trainee is Unfit");
	       }
	   }
	}
}