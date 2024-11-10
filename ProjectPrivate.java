import java.util.Scanner;
import java.lang.Math;

public class ProjectPrivate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Geometry and Calculations Program!");
        System.out.println("Choose an option:");
        System.out.println("1. 3D Objects");
        System.out.println("2. 2D Objects");
        System.out.println("3. Normal Calculations");
        
        int choice = sc.nextInt();
        
        switch(choice) {
            case 1:
                handle3DObjects(sc);
                break;
            case 2:
                handle2DObjects(sc);
                break;
            case 3:
                handleCalculations(sc);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    private static void handle3DObjects(Scanner sc) {
        System.out.println("\nChoose a 3D shape:");
        System.out.println("1. Cube");
        System.out.println("2. Cuboid");
        System.out.println("3. Sphere");
        System.out.println("4. Cylinder");
        System.out.println("5. Cone");
        System.out.println("6. Pyramid");
        
        int shape = sc.nextInt();
        
        switch(shape) {
            case 1: // Cube
                System.out.println("Enter side length:");
                double side = sc.nextDouble();
                System.out.println("CSA = " + (4 * side * side));
                System.out.println("TSA = " + (6 * side * side));
                System.out.println("Volume = " + (side * side * side));
                break;
                
            case 2: // Cuboid
                System.out.println("Enter length, breadth and height:");
                double l = sc.nextDouble();
                double b = sc.nextDouble();
                double h = sc.nextDouble();
                System.out.println("CSA = " + (2 * h * (l + b)));
                System.out.println("TSA = " + (2 * (l*b + b*h + h*l)));
                System.out.println("Volume = " + (l * b * h));
                break;
                
            case 3: // Sphere
                System.out.println("Enter radius:");
                double r = sc.nextDouble();
                System.out.println("CSA = " + (4 * Math.PI * r * r));
                System.out.println("TSA = " + (4 * Math.PI * r * r));
                System.out.println("Volume = " + ((4.0/3.0) * Math.PI * r * r * r));
                break;
                
            case 4: // Cylinder
                System.out.println("Enter radius and height:");
                double radius = sc.nextDouble();
                double height = sc.nextDouble();
                System.out.println("CSA = " + (2 * Math.PI * radius * height));
                System.out.println("TSA = " + (2 * Math.PI * radius * (radius + height)));
                System.out.println("Volume = " + (Math.PI * radius * radius * height));
                break;
                
            case 5: // Cone
                System.out.println("\nFor Cone, choose what you know:");
                System.out.println("1. Radius and Height");
                System.out.println("2. Radius and Slant Height");
                System.out.println("3. Height and Slant Height");
                System.out.println("4. Radius and Volume");
                System.out.println("5. Height and Volume");
                
                int coneChoice = sc.nextInt();
                double coneRadius, coneHeight, slant, volume;
                
                switch(coneChoice) {
                    case 1:
                        System.out.println("Enter radius and height:");
                        coneRadius = sc.nextDouble();
                        coneHeight = sc.nextDouble();
                        slant = Math.sqrt(coneRadius*coneRadius + coneHeight*coneHeight);
                        volume = (1.0/3.0) * Math.PI * coneRadius * coneRadius * coneHeight;
                        printConeResults(coneRadius, coneHeight, slant, volume);
                        break;
                        
                    case 2:
                        System.out.println("Enter radius and slant height:");
                        coneRadius = sc.nextDouble();
                        slant = sc.nextDouble();
                        coneHeight = Math.sqrt(slant*slant - coneRadius*coneRadius);
                        volume = (1.0/3.0) * Math.PI * coneRadius * coneRadius * coneHeight;
                        printConeResults(coneRadius, coneHeight, slant, volume);
                        break;
                        
                    case 3:
                        System.out.println("Enter height and slant height:");
                        coneHeight = sc.nextDouble();
                        slant = sc.nextDouble();
                        coneRadius = Math.sqrt(slant*slant - coneHeight*coneHeight);
                        volume = (1.0/3.0) * Math.PI * coneRadius * coneRadius * coneHeight;
                        printConeResults(coneRadius, coneHeight, slant, volume);
                        break;
                        
                    case 4:
                        System.out.println("Enter radius and volume:");
                        coneRadius = sc.nextDouble();
                        volume = sc.nextDouble();
                        coneHeight = (3 * volume)/(Math.PI * coneRadius * coneRadius);
                        slant = Math.sqrt(coneRadius*coneRadius + coneHeight*coneHeight);
                        printConeResults(coneRadius, coneHeight, slant, volume);
                        break;
                        
                    case 5:
                        System.out.println("Enter height and volume:");
                        coneHeight = sc.nextDouble();
                        volume = sc.nextDouble();
                        coneRadius = Math.sqrt((3 * volume)/(Math.PI * coneHeight));
                        slant = Math.sqrt(coneRadius*coneRadius + coneHeight*coneHeight);
                        printConeResults(coneRadius, coneHeight, slant, volume);
                        break;
                }
                break;
                
            case 6: // Pyramid
                System.out.println("Enter base side and height:");
                double baseSide = sc.nextDouble();
                double pyrHeight = sc.nextDouble();
                double pyrSlant = Math.sqrt(pyrHeight*pyrHeight + (baseSide/2)*(baseSide/2));
                System.out.println("CSA = " + (2 * baseSide * pyrSlant));
                System.out.println("TSA = " + (baseSide * baseSide + 2 * baseSide * pyrSlant));
                System.out.println("Volume = " + ((1.0/3.0) * baseSide * baseSide * pyrHeight));
                break;
        }
    }

    private static void printConeResults(double radius, double height, double slant, double volume) {
        System.out.println("CSA = " + (Math.PI * radius * slant));
        System.out.println("TSA = " + (Math.PI * radius * (radius + slant)));
        System.out.println("Volume = " + volume);
        System.out.println("Additional measurements:");
        System.out.println("Radius = " + radius);
        System.out.println("Height = " + height);
        System.out.println("Slant Height = " + slant);
    }

    private static void handle2DObjects(Scanner sc) {
        System.out.println("\nChoose a 2D shape:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.println("4. Triangle");
        System.out.println("5. Trapezium");
        System.out.println("6. Parallelogram");
        
        int shape = sc.nextInt();
        
        switch(shape) {
            case 1: // Square
                System.out.println("Enter side:");
                double side = sc.nextDouble();
                System.out.println("Perimeter = " + (4 * side));
                System.out.println("Area = " + (side * side));
                break;
                
            case 2: // Rectangle
                System.out.println("Enter length and breadth:");
                double length = sc.nextDouble();
                double breadth = sc.nextDouble();
                System.out.println("Perimeter = " + (2 * (length + breadth)));
                System.out.println("Area = " + (length * breadth));
                break;
                
            case 3: // Circle
                System.out.println("Enter radius:");
                double r = sc.nextDouble();
                System.out.println("Perimeter = " + (2 * Math.PI * r));
                System.out.println("Area = " + (Math.PI * r * r));
                break;
                
            case 4: // Triangle
                System.out.println("Enter three sides (or 0 if unknown):");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                if(a != 0 && b != 0 && c != 0) {
                    double s = (a + b + c)/2;
                    System.out.println("Perimeter = " + (a + b + c));
                    System.out.println("Area = " + Math.sqrt(s*(s-a)*(s-b)*(s-c)));
                }
                break;
                
            case 5: // Trapezium
                System.out.println("\nFor Trapezium, choose what you know:");
                System.out.println("1. Parallel sides and height");
                System.out.println("2. Parallel sides and non-parallel sides");
                System.out.println("3. One parallel side, height and area");
                System.out.println("4. Both parallel sides and area");
                
                int trapChoice = sc.nextInt();
                double a1, a2, h, area, side1, side2;
                
                switch(trapChoice) {
                    case 1:
                        System.out.println("Enter parallel sides and height:");
                        a1 = sc.nextDouble();
                        a2 = sc.nextDouble();
                        h = sc.nextDouble();
                        area = 0.5 * (a1 + a2) * h;
                        System.out.println("Area = " + area);
                        break;
                        
                    case 2:
                        System.out.println("Enter parallel sides and non-parallel sides:");
                        a1 = sc.nextDouble();
                        a2 = sc.nextDouble();
                        side1 = sc.nextDouble();
                        side2 = sc.nextDouble();
                        System.out.println("Perimeter = " + (a1 + a2 + side1 + side2));
                        break;
                        
                    case 3:
                        System.out.println("Enter one parallel side, height and area:");
                        a1 = sc.nextDouble();
                        h = sc.nextDouble();
                        area = sc.nextDouble();
                        a2 = (2 * area/h) - a1;
                        System.out.println("Other parallel side = " + a2);
                        break;
                        
                    case 4:
                        System.out.println("Enter both parallel sides and area:");
                        a1 = sc.nextDouble();
                        a2 = sc.nextDouble();
                        area = sc.nextDouble();
                        h = (2 * area)/(a1 + a2);
                        System.out.println("Height = " + h);
                        break;
                }
                break;

            case 6: // Parallelogram
                System.out.println("\nFor Parallelogram, choose what you know:");
                System.out.println("1. Base and height");
                System.out.println("2. Base, side and angle");
                System.out.println("3. Base and area");
                System.out.println("4. Two sides and angle");
                
                int paraChoice = sc.nextInt();
                double base, height, sideLength, angle, paraArea;
                
                switch(paraChoice) {
                    case 1:
                        System.out.println("Enter base and height:");
                        base = sc.nextDouble();
                        height = sc.nextDouble();
                        paraArea = base * height;
                        System.out.println("Area = " + paraArea);
                        break;
                        
                    case 2:
                        System.out.println("Enter base, side and angle (in degrees):");
                        base = sc.nextDouble();
                        sideLength = sc.nextDouble();
                        angle = sc.nextDouble();
                        height = sideLength * Math.sin(Math.toRadians(angle));
                        paraArea = base * height;
                        System.out.println("Area = " + paraArea);
                        System.out.println("Height = " + height);
                        break;
                        
                    case 3:
                        System.out.println("Enter base and area:");
                        base = sc.nextDouble();
                        paraArea = sc.nextDouble();
                        height = paraArea/base;
                        System.out.println("Height = " + height);
                        break;
                        
                    case 4:
                        System.out.println("Enter two sides and angle between them (in degrees):");
                        base = sc.nextDouble();
                        sideLength = sc.nextDouble();
                        angle = sc.nextDouble();
                        paraArea = base * sideLength * Math.sin(Math.toRadians(angle));
                        System.out.println("Area = " + paraArea);
                        break;
                }
                break;
        }
    }

    private static void handleCalculations(Scanner sc) {
        System.out.println("\nChoose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square");
        System.out.println("6. Square Root");
        System.out.println("7. Cube");
        System.out.println("8. Cube Root");
        
        int operation = sc.nextInt();
        double n1, n2;
        
        switch(operation) {
            case 1:
                System.out.println("Enter two numbers:");
                n1 = sc.nextDouble();
                n2 = sc.nextDouble();
                System.out.println("Result = " + (n1 + n2));
                break;
                
            case 2:
                System.out.println("Enter two numbers:");
                n1 = sc.nextDouble();
                n2 = sc.nextDouble();
                System.out.println("Result = " + (n1 - n2));
                break;
                
            case 3:
                System.out.println("Enter two numbers:");
                n1 = sc.nextDouble();
                n2 = sc.nextDouble();
                System.out.println("Result = " + (n1 * n2));
                break;
                
            case 4:
                System.out.println("Enter two numbers:");
                n1 = sc.nextDouble();
                n2 = sc.nextDouble();
                if(n2 != 0) {
                    System.out.println("Result = " + (n1 / n2));
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;
                
            case 5:
                System.out.println("Enter a number:");
                n1 = sc.nextDouble();
                System.out.println("Result = " + (n1 * n1));
                break;
                
            case 6:
                System.out.println("Enter a number:");
                n1 = sc.nextDouble();
                if(n1 >= 0) {
                    System.out.println("Result = " + Math.sqrt(n1));
                } else {
                    System.out.println("Cannot find square root of negative number!");
                }
                break;
                
            case 7:
                System.out.println("Enter a number:");
                n1 = sc.nextDouble();
                System.out.println("Result = " + (n1 * n1 * n1));
                break;
                
            case 8:
                System.out.println("Enter a number:");
                n1 = sc.nextDouble();
                System.out.println("Result = " + Math.cbrt(n1));
                break;
        }
    }
}
