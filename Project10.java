// Abstract Shape class
class Shape {
    public double getVolume() {
        return 0;
    }
}

// Sphere class that extends Shape
class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        // Volume of sphere = (4/3) * π * r^3
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

// Cone class that extends Shape
class Cone extends Shape {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        // Volume of cone = (1/3) * π * r^2 * h
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }
}

// Cube class that extends Shape
class Cube extends Shape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        // Volume of cube = side^3
        return Math.pow(side, 3);
    }
}

// Cuboid class that extends Shape
class Cuboid extends Shape {
    private double length;
    private double breadth;
    private double height;

    public Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    public double getVolume() {
        // Volume of cuboid = length * breadth * height
        return length * breadth * height;
    }
}

// Main class to test the volume calculation
public class Project10{
    public static void main(String[] args) {
        // Creating an array of Shape objects to hold different shapes
        Shape[] shapes = new Shape[4];

        // Initializing the shapes with their dimensions
        shapes[0] = new Sphere(3);         // Sphere with radius 3
        shapes[1] = new Cone(3, 5);        // Cone with radius 3 and height 5
        shapes[2] = new Cube(4);           // Cube with side 4
        shapes[3] = new Cuboid(2, 3, 4);   // Cuboid with length 2, breadth 3, and height 4

        // Printing the volumes of each shape
        System.out.println("The Volume of your Sphere is: " + shapes[0].getVolume());
        System.out.println("The Volume of your Cone is: " + shapes[1].getVolume());
        System.out.println("The Volume of your Cube is: " + shapes[2].getVolume());
        System.out.println("The Volume of your Cuboid is: " + shapes[3].getVolume());
    }
}
