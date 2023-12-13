package AssignmentCoreJavaInheritance;

// Interface for the first behavior
interface Flying {
    void fly();
}

// Interface for the second behavior
interface Running {
    void run();
}

class Bird implements Flying, Running {
    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }

    @Override
    public void run() {
        System.out.println("Bird is running.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Bird bird = new Bird();

        bird.fly();
        bird.run();
    }
}

