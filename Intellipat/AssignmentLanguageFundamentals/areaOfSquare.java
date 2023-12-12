package AssignmentLanguageFundamentals;

import java.util.Scanner;

public class areaOfSquare {
    public static void main(String[] args){
        System.out.print("Enter The Lenght Of Area ");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int area = l*l;
        System.out.println("Area of Square is = " +area);
        sc.close();
    }
    
}
