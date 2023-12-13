package AssignmentCoreJavaExceptionHandling;

public class ZeroDivisionException {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;
        // int divisor = 5;

        try {
            
            int result = dividend / divisor;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            
            System.out.println("Error: Division by zero occurred.");
           
        }
    }
}

