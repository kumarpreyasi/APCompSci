public class Main {

    public static void main(String[] args) {
        
        System.out.println();

        Fighter player1 = new Fighter("Doug");
        player1.showStats();
        System.out.println();

        Mage player2 = new Mage("Mike");
        player2.showStats();
        System.out.println();

        Paladin player3 = new Paladin("player3");
        player3.showStats();
        System.out.println();

        Priest player4 = new Priest("Bob");
        player4.showStats();
        System.out.println();
    }
}
