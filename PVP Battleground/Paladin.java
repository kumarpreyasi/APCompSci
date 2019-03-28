import java.util.Random;

public class Paladin extends PlayerCharacter implements Tank, Healer{

    private int wisdom, constitution;

    public Paladin(String newName){

        name = newName;

        System.out.println("A new Paladin, " + name + ", has been created!");

        Random rand = new Random();

        strength = 10 + (rand.nextInt(6) + 1);
        intelligence = 15 + (rand.nextInt(6) + 1);
        agility = 5 + (rand.nextInt(6) + 1);
        wisdom = 10 + (rand.nextInt(6) + 1);
        constitution = 10 + (rand.nextInt(6) + 1);

        hp = maxhp = strength + (constitution * 2);
        mp = maxmp = intelligence + (wisdom * 2);
    }

    public void showStats() {

        System.out.printf("%s, a Paladin:\n",name);

        super.showStats();

        System.out.printf("WIS: %3d\nCON: %3d\n",wisdom,constitution);

    }

}
