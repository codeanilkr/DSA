package AssignmentObjectsAndClasses.CreateTwoClasses;

public class ClassB {
    public static void main(String[] args) {
        A objA = new A();

        // Accessing protected variable of class A from class B
        System.out.println("Accessing protectedVar from class B: " + objA.protectedVar);

        // Accessing protected method of class A from class B
        objA.protectedMethod();
    }
}
