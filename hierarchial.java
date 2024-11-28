class Animals{
    String food;
    String sound;
    String area;
    void info(){
        System.out.println("INFORMATION ABOUT ANIMALS");
    }

}

class Lion extends Animals{
    void roar(String food,String sound, String area){
        System.out.println("This animal eats :- "+food + " | This animal makes this sound :- " + sound + " | This animal lives in :- " + area); 
    }
}

class Elephant extends Animals{
    void Step(String food,String sound, String area){
        System.out.println("This animal eats :- "+food + " | This animal makes this sound :- " + sound + " | This animal lives in :- " + area); 
    }
}

class Snake extends Animals{
    void Sssss(String food,String sound, String area){
        System.out.println("This animal eats :- "+food + " | This animal makes this sound :- " + sound + " | This animal lives in :- " + area); 
    }
}



public class hierarchial {
    public static void main(String[] args){
        Lion l= new Lion();
        Elephant e= new Elephant();
        Snake s= new Snake();
        l.roar("Meat", "ROAR","Jungles");
        e.Step("Banana", "EEUHH","Wild Areas");
        s.Sssss("Flesh", "SSSzzSSzzsssss","Deserts");

    }
}
