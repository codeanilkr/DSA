package AssignmentCoreJavaCoreClasses;

import java.util.Scanner;
public class LowercaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String convertedString = convertToLowerCase(input);

        System.out.println("String after converting uppercase to lowercase: " + convertedString);

        sc.close();
    }

    public static String convertToLowerCase(String str) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
    
                charArray[i] = (char) (charArray[i] + 32);
            }
        }

        return new String(charArray);
    }
}
