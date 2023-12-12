package Assignment2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        boolean exit = false;
        double result = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        double a = sc.nextDouble();

        System.out.println("Enter Valid Operator + - * /");
        String operator = sc.next();

        if (operator.matches("[+\\-*/]")) {
            System.out.println("Please Enter Second Number ");
            double b = sc.nextDouble();

            while (!exit) {
                switch (operator) {
                    case ("+"):
                        result = (a + b);
                        break;
                    case ("-"):
                        result = (a - b);
                        break;
                    case ("*"):
                        result = (a * b);
                        break;
                    case ("/"):
                        if (b != 0) {
                            result = (a / b);
                        } else {
                            System.out.println("Cannot divide by zero. Enter a valid number.");
                        }
                        break;
                    case ("exit"):
                        exit = true;
                        break;
                    default:
                        break;
                }

                System.out.println("Result: " + result);

                if (!exit) {
                    System.out.println("Enter Valid Operator + - * / or 'exit' to quit");
                    operator = sc.next();
                    if (operator.equals("exit")) {
                        exit = true;
                    } else if (!operator.matches("[+\\-*/]")) {
                        System.out.println("Invalid operator. Please try again.");
                        exit = true;
                    } else {
                        System.out.println("Please Enter Second Number ");
                        b = sc.nextDouble();
                    }
                }
            }
        } else {
            System.out.println("Invalid operator. Please try again.");
        }

        sc.close();
    }
}
