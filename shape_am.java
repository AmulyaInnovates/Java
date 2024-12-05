class Shape{
    public double getArea(){
        return 0;
    }
}

class Triangles extends Shape{
    private double base;
    private double height;
    public Triangles(double base , double height){
        this.base=base;
        this.height=height;
    }
    @Override
    public double getArea(){
        return 0.5*base*height;
    }
}

class Square extends Shape{
    private double side;
    public Square(double side){
        this.side=side;
    }
    @Override
    public double getArea(){
        return side*side;
    }
}

class Rectangle extends Shape{
    private double length;
    private double breadth;
    public Rectangle(double length, double breadth){
        this.length= length;
        this.breadth= breadth;
    }
    @Override
    public double getArea(){
        return length*breadth;
    }
}
public class shape_am {
    public static void main(String[] args){
        Shape[] s= new Shape[3];

        s[0]= new Triangles(2,2);
        s[1]= new Square(5);
        s[2]=new Rectangle(2,3);

        System.out.println("The Area of your Triangle is :- "+ s[0].getArea());
        System.out.println("The Area of your Square is :- "+ s[1].getArea());
        System.out.println("The Area of your Rectangle is :- "+ s[2].getArea());
    }
}
