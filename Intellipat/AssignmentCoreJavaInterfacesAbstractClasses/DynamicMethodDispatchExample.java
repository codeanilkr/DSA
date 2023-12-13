package AssignmentCoreJavaInterfacesAbstractClasses;

// Interface A with a method
interface A {
    void myMethod();
}

// Class B implementing interface A
class B implements A {
    public void myMethod() {
        System.out.println("Implementation of myMethod() in Class B");
    }
}

// Class C also implementing interface A
class C implements A {
    public void myMethod() {
        System.out.println("Implementation of myMethod() in Class C");
    }
}

public class DynamicMethodDispatchExample {
    public static void main(String[] args) {
      
        A obj1 = new B(); 
        A obj2 = new C(); 

        obj1.myMethod(); 
        obj2.myMethod(); 
    }
}

