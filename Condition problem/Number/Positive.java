import java.util.Scanner;
class Positive   
{
    public static void main(String args[]){
        int number;
        System.out.println("Enter a number: ");
        Scanner ref=new Scanner(System.in);
        number=ref.nextInt();
        if(number>=0)
        {
            System.out.println("+ve number ");
        }else{
            System.out.println("-ve number ");
        }
    }
}