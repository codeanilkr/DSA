import java.util.Scanner;

public class SumOfTwoNum {
    public static void main(String[] args){
        System.out.println("Enter The First Number");
Scanner sc = new Scanner(System.in);
int num1 = sc.nextInt();
System.out.println("Enter The Second Number");
int num2 = sc.nextInt();
int sum = num1 + num2;
System.out.println("Sum =  " + sum);


  sc.close();
    }
  
    
}
