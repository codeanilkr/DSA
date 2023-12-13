package AssignmentObjectsAndClasses;

public class Student {
    private String standard;
    private int rollNo;
    private char section;

    // Getter methods
    public String getStandard() {
        return standard;
    }

    public int getRollNo() {
        return rollNo;
    }

    public char getSection() {
        return section;
    }

    // Setter methods
    public void setStandard(String standard) {
        this.standard = standard;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public static void main(String[] args) {
        Student student = new Student();

        // Setting values using setter methods
        student.setStandard("10th");
        student.setRollNo(101);
        student.setSection('A');

        // Accessing values using getter methods and printing
        System.out.println("Standard: " + student.getStandard());
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Section: " + student.getSection());
    }
}
