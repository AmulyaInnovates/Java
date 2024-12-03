class Parent{
    int i=10;
}

class Child extends Parent{
    int i=20;

    void display_data(){
        System.out.println("The Child class number :- "+ i);

        System.out.println("The arent class number :- " + super.i);
    }
}

public class super_1{
    public static void main(String[] args){
        Child s=new Child();
        s.display_data();
    }

}
