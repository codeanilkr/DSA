package AssignmentCoreJavaInheritance;

class A {
    public void display() {
        System.out.println("Method from class A");
    }
}

class B extends A {
    // Overriding the display method from class A in class B
    @Override
    public void display() {
        System.out.println("Method from class B");
    }

    public void display(String message) {
        System.out.println("Method from class B: " + message);
    }
}

public class MethodOverloadingQuestion {
    public static void main(String[] args) {
     
        B objB = new B();

        objB.display(); 

        objB.display("Overloaded method"); 
    }
}
