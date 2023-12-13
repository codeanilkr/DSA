package AssignmentObjectsAndClasses;


    public class Addition {
        // Method 1: Accepts 2 integer arguments
        public int sum(int a, int b) {
            return a + b;
        }
    
        // Method 2: Accepts 3 integer arguments
        public int sum(int a, int b, int c) {
            return a + b + c;
        }
    
        // Method 3: Accepts 1 integer and 1 double argument
        public double sum(int a, double b) {
            return a + b;
        }
    
        public static void main(String[] args) {
            Addition obj = new Addition();
    
            // Calling and printing results of method 1
            System.out.println("Sum of 2 numbers: " + obj.sum(5, 7));
    
            // Calling and printing results of method 2
            System.out.println("Sum of 3 numbers: " + obj.sum(5, 7, 10));
    
            // Calling and printing results of method 3
            System.out.println("Sum of an int and a double: " + obj.sum(5, 7.5));
        }
    
    
}
