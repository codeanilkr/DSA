package AssignmentObjectsAndClasses;

public class Intellipaat_Record {
    // Class variables
    String name;
    int roll_number;

    // Default constructor
    public Intellipaat_Record() {
        // Initializing variables with default values
        name = "";
        roll_number = 0;
    }

    // Parameterized constructor
    public Intellipaat_Record(String name, int roll_number) {
        // Assigning values to variables using parameters
        this.name = name;
        this.roll_number = roll_number;
    }

    public static void main(String[] args) {
        // Creating objects and assigning values using constructors
        Intellipaat_Record student1 = new Intellipaat_Record("Anil", 101);
        Intellipaat_Record student2 = new Intellipaat_Record("Sunil", 102);

        // Printing the values using objects
        System.out.println("Student 1 - Name: " + student1.name + ", Roll Number: " + student1.roll_number);
        System.out.println("Student 2 - Name: " + student2.name + ", Roll Number: " + student2.roll_number);
    }
}

