package AssignmentCoreJavaInterfacesAbstractClasses;

interface A {
    void methodA();
}

interface B extends A {
    void methodB();
}

class C implements B {
    @Override
    public void methodA() {
        System.out.println("Inside methodA in class C");
    }

    @Override
    public void methodB() {
        System.out.println("Inside methodB in class C");
    }
}

public class Question5 {
    public static void main(String[] args) {
        C c = new C();
        c.methodA();
        c.methodB();
    }
}
