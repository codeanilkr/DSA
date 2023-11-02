package oracle.src;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number of Terms You Want in Fibonacci Series: ");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print(fibonacci(i)); 
        }
    }

    public static int fibonacci(int a) { 
        if (a <= 1) { 
            return a;
        }
        return fibonacci(a - 1) + fibonacci(a - 2); 
    }
}
