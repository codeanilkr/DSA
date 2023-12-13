package AssignmentCoreJavaExceptionHandling;

public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3 };

        try {
          
            int number = numbers[5];
            System.out.println("Number at index 5: " + number);
        } catch (ArrayIndexOutOfBoundsException e) {
        
            System.out.println("Error: Array index is out of bounds.");
            
        }
    }
}



