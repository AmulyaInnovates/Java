class Wonders {
    void location() {
        System.out.println("Location:");
    }
    void Famous() {
        System.out.println("Famous For:");
    }
}

class GreatWallOfChina extends Wonders {
    void location() {
        System.out.println("Location: Great Wall in China");
    }
    void Famous() {
        System.out.println("Famous For: Being the longest wall in the world, historical significance.");
    }
}

class Petra extends Wonders {
    void location() {
        System.out.println("Location: Petra in Jordan");
    }
    void Famous() {
        System.out.println("Famous For: Ancient rock-cut architecture, rose-red city.");
    }
}

class ChristTheRedeemer extends Wonders {
    void location() {
        System.out.println("Location: Christ the Redeemer in Rio de Janeiro, Brazil");
    }
    void Famous() {
        System.out.println("Famous For: Iconic statue of Jesus Christ, panoramic views.");
    }
}

class MachuPicchu extends Wonders {
    void location() {
        System.out.println("Location: Machu Picchu in Peru");
    }
    void Famous() {
        System.out.println("Famous For: Ancient Incan city, breathtaking mountain views.");
    }
}

class ChichenItza extends Wonders {
    void location() {
        System.out.println("Location: Chichen Itza in Mexico");
    }
    void Famous() {
        System.out.println("Famous For: Mayan ruins, El Castillo pyramid.");
    }
}

class RomanColosseum extends Wonders {
    void location() {
        System.out.println("Location: Roman Colosseum in Rome, Italy");
    }
    void Famous() {
        System.out.println("Famous For: Ancient amphitheater, gladiator games.");
    }
}

class TajMahal extends Wonders {
    void location() {
        System.out.println("Location: Taj Mahal in Agra, India");
    }
    void Famous() {
        System.out.println("Famous For: Stunning marble mausoleum, symbol of love.");
    }
}

public class Project11 {
    public static void main(String[] args) {
        GreatWallOfChina A = new GreatWallOfChina();
        Petra B = new Petra();
        ChristTheRedeemer C = new ChristTheRedeemer();
        MachuPicchu D = new MachuPicchu();
        ChichenItza E = new ChichenItza();
        RomanColosseum F = new RomanColosseum();
        TajMahal G = new TajMahal();

        A.location();
        A.Famous();
        System.out.println("---------------------------------");
        B.location();
        B.Famous();
        System.out.println("---------------------------------");
        C.location();
        C.Famous();
        System.out.println("---------------------------------");
        D.location();
        D.Famous();
        System.out.println("---------------------------------");
        E.location();
        E.Famous();
        System.out.println("---------------------------------");
        F.location();
        F.Famous();
        System.out.println("---------------------------------");
        G.location();
        G.Famous();
        System.out.println("---------------------------------");
    }
}
