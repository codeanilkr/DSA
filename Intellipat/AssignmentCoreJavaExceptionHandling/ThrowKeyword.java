package AssignmentCoreJavaExceptionHandling;

public class ThrowKeyword {
    public static void main(String[] args) {
        try {
          
            validateAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        }
    }

    public static void validateAge(int age) {
        if (age < 18) {

            throw new IllegalArgumentException("Age must be 18 or older");
        } else {
            System.out.println("Valid age: " + age);
        }
    }
}


