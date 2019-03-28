import java.util.ArrayList;

public class Main {

    public static Party friends;
    public static Party foes;


    public static void main(String[] args) {

        ArrayList<PlayerCharacter> players = new ArrayList<PlayerCharacter>();
        players.add(new Fighter("Karma"));
        players.add(new Mage("Bob"));
        players.add(new Paladin("Tina Turner"));
        players.add(new Priest("Greg"));

        Tank t;
        Range r;
        Healer h;

        System.out.println(players.size());

        for (PlayerCharacter x : players) {
            if (x instanceof Tank) {
                t = (Tank) x;
                friends.addPlayer(t);
            }
            else if(x instanceof Range) {
                r = (Range) x;
                friends.addPlayer(r);
            }
            else if(x instanceof Healer) {
                h = (Healer) x;
                friends.addPlayer(h);
            }
        }


//        System.out.println();
//
//        Fighter player1 = new Fighter("Doug");
//        player1.showStats();
//        System.out.println();
//
//        Mage player2 = new Mage("Mike");
//        player2.showStats();
//        System.out.println();
//
//        Paladin player3 = new Paladin("player3");
//        player3.showStats();
//        System.out.println();
//
//        Priest player4 = new Priest("Bob");
//        player4.showStats();
//        System.out.println();


        friends = new Party();
        foes = new Party();

        foes.addPlayer((Tank) new Paladin("The Bad Paladin"));
        foes.addPlayer(new Priest("The Bad Priest"));
        foes.addPlayer(new Mage("The Bad Mage"));

        foes.showStats();


    }

}



