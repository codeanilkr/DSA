package AssignmentCoreJavaInterfacesAbstractClasses;

// Abstract class with an abstract method
abstract class MyAbstractClass {
    // Abstract method without implementation
    public abstract void myAbstractMethod();
}

// Subclass inheriting from the abstract class
class MySubclass extends MyAbstractClass {
    
    public void myAbstractMethod() {
        System.out.println("Implementation of myAbstractMethod() in MySubclass");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
       
        MySubclass obj = new MySubclass();
        obj.myAbstractMethod(); 
    }
}

