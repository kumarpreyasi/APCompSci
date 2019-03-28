import java.util.Random;

public class Mage extends PlayerCharacter implements Range {

    private int wisdom;

    public Mage(String newName){

        name = newName;

        System.out.println("A new Mage, " + name + ", has been created!");

        Random rand = new Random();

        strength = 7 + (rand.nextInt(6) + 1);
        intelligence = 15 + (rand.nextInt(6) + 1);
        agility = 8 + (rand.nextInt(6) + 1);
        wisdom = 10 + (rand.nextInt(6) + 1);

        hp = maxhp = strength;
        mp = maxmp = intelligence + (wisdom * 2);
    }

    public void showStats() {

        System.out.printf("%s, a Mage:\n",name);

        super.showStats();

        System.out.printf("WIS: %3d\n",wisdom);
    }


}
