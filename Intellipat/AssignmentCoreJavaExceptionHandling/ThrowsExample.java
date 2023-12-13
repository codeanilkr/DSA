package AssignmentCoreJavaExceptionHandling;

import java.io.IOException;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            methodThatThrows();
        } catch (IOException e) {
            System.out.println("IOException caught in the main method: " + e.getMessage());
        }
    }

    public static void methodThatThrows() throws IOException {

        throw new IOException("This method throws an IOException");
    }
}

