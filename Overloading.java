class Student{
    int id;
    String name;
    float income;

    Student(){
        
    }

    Student(int id, String name){
        this.id= id;
        this.name=name;
    }

    Student(int id, String name, float income){
        this.id=id;
        this.name=name;
        this.income=income;
    }

    void output(){
        System.out.println("The ID: "+ this.id + " | The Name: "+ this.name + " | Income: "+ this.income);
    }
}

public class Overloading {
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student(2556, "Amulya");
        Student s3=new Student(2556, "Amulya", 1000000);

        s1.output();
        s2.output();
        s3.output();
    
    }
}
