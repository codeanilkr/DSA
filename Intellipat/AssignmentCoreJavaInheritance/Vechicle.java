package AssignmentCoreJavaInheritance;

class Vehicle {
    public void start() {
        System.out.println("Vehicle started.");
    }

    public void stop() {
        System.out.println("Vehicle stopped.");
    }

    public void accelerate() {
        System.out.println("Vehicle is accelerating.");
    }
    //   public void forSale() {
    //     System.out.println("Vehicle is For Sale.");
    // }
}

class Car extends Vehicle {
    public static void main(String[] args) {
        Car myCar = new Car();

     
        myCar.start();
        myCar.stop();
        myCar.accelerate();
        // myCar.forSale();
    }
}

