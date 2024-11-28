class Mammals_1 {
    String food;
    String sound;
    String child;
    String area;

    void info() {
        System.out.println("INFORMATION ABOUT MAMMALS");
    }
}

class Lion extends Mammals_1 {
    void roar(String food, String sound, String area, String child) {
        System.out.println("This animal eats :- " + food + " | This animal makes this sound :- " + sound + 
                           " | This animal lives in :- " + area + " | These give birth to :- " + child); 
    }
}

class Elephant extends Mammals_1 {
    void Step(String food, String sound, String area, String child) {
        System.out.println("This animal eats :- " + food + " | This animal makes this sound :- " + sound + 
                           " | This animal lives in :- " + area + " | These give birth to :- " + child); 
    }
}

class Humans extends Mammals_1 {
    void Sssss(String food, String sound, String area, String child) {
        System.out.println("Us Humans eat :- " + food + " | This animal makes this sound :- " + sound + 
                           " | This animal lives in :- " + area + " | These give birth to :- " + child); 
    }
}

public class Mammals {
    public static void main(String[] args) {
        Lion l = new Lion();
        Elephant e = new Elephant();
        Humans h = new Humans();
        
        l.roar("Meat", "ROAR", "Jungles", "Cubs");
        e.Step("Banana", "EEUHH", "Wild Areas", "Calves");
        h.Sssss("Veg food", "Speaking Skills", "Urban and Rural Areas", "Human Children");
    }
}
