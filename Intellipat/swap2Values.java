import java.util.Scanner;

public class swap2Values {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number a =");
        int a = sc.nextInt();
        System.out.print("Enter Second Number s = ");
        int b = sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping a = " + a + " b = " + b);
       sc.close();

    }
    
}
