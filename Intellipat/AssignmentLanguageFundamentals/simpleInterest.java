package AssignmentLanguageFundamentals;

import java.util.Scanner;
public class simpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest (in % per annum): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time Period (in years): ");
        double time = scanner.nextDouble();

        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest: " + simpleInterest);

        scanner.close();
    }

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}
