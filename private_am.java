class Student{
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}


public class private_am {
    public static void main(String[] args){
        Student s= new Student();
        s.setName("Amulya Gupta");
        System.out.println("We have successfully set your name to :- " + s.getName());
    }
}
