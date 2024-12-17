interface Myinterface{

    public void method1();
    public void method2();

}

public class interfaces implements Myinterface{
    
    public void method1(){
        System.out.println("This is the implementation of Method-1 .");
    }
    public void method2(){
        System.out.println("This is the implementation of Method-2 .");
    }

    public static void main(String[] args){
        Myinterface obj= new interfaces();

        obj.method1();
        obj.method2();

    }
}
