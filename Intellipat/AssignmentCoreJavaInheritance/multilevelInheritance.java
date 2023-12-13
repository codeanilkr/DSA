package AssignmentCoreJavaInheritance;

class A {
    public void displayA() {
        System.out.println("Inside class A");
    }
}

class B extends A {
    public void displayB() {
        System.out.println("Inside class B");
    }
}

class C extends B {
    public void displayC() {
        System.out.println("Inside class C");
    }
    
    public static void main(String[] args) {
        C objC = new C();
        
      
        objC.displayA();
        objC.displayB();
        objC.displayC();
    }
}

