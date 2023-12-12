package Assignment5;

import java.util.Scanner;

public class NumericDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter the number of rows (height) for the diamond (odd number between 1 and 20): ");
            n = sc.nextInt();
        } while (n % 2 == 0 || n < 1 || n > 20); 

        int spaces = n / 2;
        int numbers = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= numbers; j++) {
                System.out.print(j);
            }

            System.out.println();

            if (i <= n / 2) {
                spaces--;
                numbers += 2;
            } else {
                spaces++;
                numbers -= 2;
            }
        }
        sc.close();
    }
}

