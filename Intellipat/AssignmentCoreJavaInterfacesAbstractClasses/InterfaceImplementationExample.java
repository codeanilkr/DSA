package AssignmentCoreJavaInterfacesAbstractClasses;

// Interface with a method declaration
interface MyInterface {
    void myMethod(); // Method declaration without a body
}

class MyClass implements MyInterface {
    
    public void myMethod() {
        System.out.println("Implementation of myMethod() in MyClass");
    }
}

public class InterfaceImplementationExample {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.myMethod();
    }
}

