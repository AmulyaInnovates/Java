public class Animal{
    private String name;
    private int age;
    
    public Animal(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void makeSound(){
        System.out.println("This Animal maked Sound !!!");
    }
}

public class Dog extends Animal{
    private String breed; 
    public Dog(String name, int age, String breed){
        super(name,age);
        this.breed=breed;
    }
    public String getBreed(){
        return this.breed;
    }

    public void makeSound(){
        System.out.println("The Dog Barks !!!");
    }
}

public class Cat extends Animal{
    private boolean isIndoor; 
    public Cat(String name, int age, boolean isIndoor){
        super(name,age);
        this.isIndoor=isIndoor;
    }
    public String getIsIndoor(){
        return isIndoor;
    }

    public void makeSound(){
        System.out.println("The Cat Meows !!!");
    }
}

public class revision_3{

    public static void main(String[] args){
        Animal animal= new Animal("Tom",2);
        Dog dog1= new Dog("Tom",2,"Labrador");
        Cat cat1=new Cat("Bill",2,true);
        animal.makeSound();
        dog1.makeSound();
        cat1.makeSound();
        System.out.println("The name of Animal is :- "+ animal.getName()+ " | & The Age of the Animal is :-  " + animal.getAge());
        System.out.println("The name of Dog is :- "+ dog1.getName()+ " | & The Age of the Dog is :-  " + dog1.getAge()+ " | & The Breed of the Animal is :-  " + dog1.getBreed());
        System.out.println("The name of Cat is :- "+ cat1.getName()+ " | & The Age of Cat is :-  " + cat1.getAge()+ " | & The cat stays Indoors :-  " +(cat1.getIsIndoor() ? "Indoor":"Outdoor"));
        
    }
}