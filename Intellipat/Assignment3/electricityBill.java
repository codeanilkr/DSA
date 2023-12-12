package Assignment3;

import java.util.Scanner;

public class electricityBill {
    public static void main(String[] args) {
        System.out.print("Enter the Number of Units Consumed By the Household: ");
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        sc.close();
        double bill = eleCharges(unit);
        System.out.println("Final Bill: $" + bill);
    }

    private static double eleCharges(int units) {
        double fair = 0.0;
        if (units <= 100) {
            fair = units * 2.50;
        } else if (units > 100 && units <= 200) {
            fair = 100 * 2.50 + (units - 100) * 3.00;
        } else if (units > 200) {
            fair = 100 * 2.50 + 100 * 3.00 + (units - 200) * 4.00;
        }
        return fair;
    }
}
