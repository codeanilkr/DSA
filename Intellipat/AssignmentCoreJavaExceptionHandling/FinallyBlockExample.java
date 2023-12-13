package AssignmentCoreJavaExceptionHandling;

public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero occurred.");
        } finally {
          
            System.out.println("Finally block executed.");
        }
    }

    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}

