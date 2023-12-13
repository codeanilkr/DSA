package AssignmentCoreJavaInterfacesAbstractClasses;

// Interface 1
interface Interface1 {
    void method1();
}

// Interface 2
interface Interface2 {
    void method2();
}

class MyClass implements Interface1, Interface2 {
    public void method1() {
        System.out.println("Method 1 from Interface1");
    }

    public void method2() {
        System.out.println("Method 2 from Interface2");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method1();
        obj.method2();
    }
}

