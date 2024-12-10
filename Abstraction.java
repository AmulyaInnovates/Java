abstract class Shape{
    abstract void showShape();
    void shape(){
        System.out.println("This is the Abstract Class");
    }
}

class Sphere extends Shape{
    void showShape(){
        System.out.println("This is a Sphere");
    }
}

class Cone extends Shape{
    void showShape(){
        System.out.println("This is a Cone");
    }
}

class Square extends Shape{
    void showShape(){
        System.out.println("This is a Square");
    }
}

class Rectangle extends Shape{
    void showShape(){
        System.out.println("This is a Rectangle");
    }
}


public class Abstraction {
    public static void main(String[] args){ 
        Sphere A= new Sphere();
        Cone B= new Cone();
        Square C= new Square();
        Rectangle D= new Rectangle();
        
        A.showShape();
        B.showShape();
        C.showShape();
        D.showShape();
        
    }   
}
