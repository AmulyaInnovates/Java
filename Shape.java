import java.lang.Math;

interface Shape{
    double getArea();
}

class Rectangle implements Shape{
    private double width;
    private double height;
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    @Override
    public double getArea(){
        return width*height;
    }
}

class Circle implements Shape{
    private double radius;
    public Circle(double radius){
        this.radius= radius;
    }

    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
}

class AreaCalculator{
    public double SumArea(Shape[] shapes){
        double totalArea=0;
        for(Shape shape: shapes){
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}

public class Shape{
    public static void main(String[] args){
        Shape[] shapes= new Shape[2];
        shapes[0]= new Rectangle(2,3);
        shapes[1]= new Circle(1);

        AreaCalculator calculator= new AreaCalculator();
        double totalArea =  calculator.SumArea(shapes);
        System.out.println("The total sum of Area of all the Shapes present in the Array is :- " + totalArea);
    }
}