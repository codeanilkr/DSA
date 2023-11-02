package oracle.src.Intellipat.DSA;

import java.util.Scanner;

public class LearningArrays {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value you want to find in the array");
        int num = sc.nextInt();

        int[] arr = {5, 3, 655, 8, 10, 18, 30};

        boolean found = false;

        for (int element : arr) {
            if (element == num) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(num + " is present in the array.");
        } else {
            System.out.println(num + " is not present in the array.");
        }
    }}



