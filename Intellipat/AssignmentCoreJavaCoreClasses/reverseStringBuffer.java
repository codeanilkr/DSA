package AssignmentCoreJavaCoreClasses;

import java.util.Scanner;

public class reverseStringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();
        String reversedString = reverseUsingStringBuffer(input);
        System.out.println("Reversed String: " + reversedString);
        sc.close();
    }

    public static String reverseUsingStringBuffer(String str) {
       
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        return stringBuffer.toString();
    }
}

