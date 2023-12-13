package AssignmentCoreJavaCoreClasses;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.print("Please Enter String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reversed = reverseString(str);
        System.out.println("After Reversing String: " + reversed);
        sc.close();
    }

    private static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return ""; 
        }
        char[] newChar = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            char temp = newChar[start];
            newChar[start] = newChar[end];
            newChar[end] = temp;
            start++;
            end--;
        }
        return new String(newChar);
    }
}
