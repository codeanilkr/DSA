package AssignmentCoreJavaInheritance;

class Rectangle {
   
    protected double length;
    protected double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }
}

class CalculateRectangleArea extends Rectangle {
   
    public CalculateRectangleArea(double length, double breadth) {
        super(length, breadth);
    }

    public static void main(String[] args) {
       
        CalculateRectangleArea rectangle = new CalculateRectangleArea(9.5, 114.5);

        double area = rectangle.calculateArea();

     
        System.out.println("Area of the rectangle: " + area);
    }
}

