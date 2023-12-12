package AssignmentLanguageFundamentals;
//  Write a Java code to swap two numbers
import java.util.Scanner;

public class swapTwoNum {
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter First Number A = ");
          int a = sc.nextInt();
          System.out.print("Enter First Number b = ");
          int b = sc.nextInt();

          a = (a+b);
          b = (a-b);
          a = (a-b);
          System.out.println("After Swaping A = " +a);
          System.out.println("After Swaping b = " +b);
          sc.close();
    }
    
}
