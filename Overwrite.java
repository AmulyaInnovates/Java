class Parent{
    public void answer_1(){
        System.out.println("Hello, this is the Parent Class.");
    }
}

class Child extends Parent{
    @Override
    public void answer_1(){
        System.out.println("Hello, this is the Child Class");
    }
}

public class Overwrite{
    public static void main(String[] args){
       Parent s= new Child();
    s.answer_1();
    }
}
