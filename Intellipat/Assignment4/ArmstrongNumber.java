package Assignment4;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter A positive Integer");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNum, remainder, result = 0;
        originalNum = num;
        
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, String.valueOf(num).length());
            originalNum /= 10;
        }
        
        if (result == num) {
            System.out.println(num + " Is an Armstrong Number");
        } else {
            System.out.println(num + " Is Not an Armstrong Number");
        }
        sc.close();
    }
}
