import java.util.*;
class Fibonacci {
  public static void main(String[] args) {

    int  firstTerm = 0, secondTerm = 1;
    Scanner ref=new Scanner(System.in);
    System.out.println("Enter the number of element:");
    int n=ref.nextInt();
    System.out.println("Fibonacci Series till " + n + " terms:");
    System.out.print(firstTerm+ " ");

    for (int i = 1; i < n; ++i) {
    
       
      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
        System.out.print(nextTerm + "  ");
    }
  }
}