class Parent{
    int age,idN;
    String name;

    void naming(String name){
        System.out.println("The name of the person is :- " + name);
    }

}

class Child extends Parent{
    
    void age(int age){
        System.out.println("The age of the person is :- " + age);
    }

}

class Child_2 extends Child{

    void id_of_the_person(int idN){
        System.out.println("The ID of the person is :- " + idN);
    }

}

class inheritence{
    public static void main(String[] args){
        Child_2 s= new Child_2();
        s.naming("Amulya");
        s.age(14);
        s.id_of_the_person(2556);
    }
}
