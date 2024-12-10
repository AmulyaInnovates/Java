class Hills{
    void location(){
        System.out.println("Location:");
    }
    void Famous(){
        System.out.println("Famous For:");
    }
}

class Manali extends Hills{
    void location(){
        System.out.println("Location: Manali in Himachal Pradesh");
    }
    void Famous(){
        System.out.println("Famous For: Solang Valley, Hidimba Devi Temple");
    }
}


class Mussoorie extends Hills{
    void location(){
        System.out.println("Location: Mussoorie in Uttarakhand");
    }
    void Famous(){
        System.out.println("Famous For: The Top Tibba Trek, Jwala Devi Temple, Paragliding");
    }
}


class Srinagar extends Hills{
    void location(){
        System.out.println("Location: Srinagar in J&K district.");
    }
    void Famous(){
        System.out.println("Famous For: Dal Lake, Pari Mahal, Wular Lake");
    }
}

public class hillstations {
    public static void main(String[] args){
        Manali A= new Manali();
        Mussoorie B= new Mussoorie();
        Srinagar C= new Srinagar();

        A.location();
        A.Famous();
        System.out.println("---------------------------------");
        B.location();
        B.Famous();
        System.out.println("---------------------------------");
        C.location();
        C.Famous();
        System.out.println("---------------------------------");

    }
}
