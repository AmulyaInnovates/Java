public class Classes_2 {
    //int i =10;
    static int i =10;

    void Increment(){
        i=i+1;
        System.out.println("The value is :- "+ i);
    }

    public static void main(String[] args){
        Classes_2 no1= new Classes_2();
        Classes_2 no2=new Classes_2();
        Classes_2 no3= new Classes_2();

        no1.Increment();
        no2.Increment();
        no3.Increment();

        //System.out.println(no1.i);
        //System.out.println(no2.i);
        //System.out.println(no3.i);
    }
}
