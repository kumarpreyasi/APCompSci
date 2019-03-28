import java.util.Random;

public class Priest extends PlayerCharacter implements Healer{

    private int charisma;

    public Priest(String newName){

        name = newName;

        System.out.println("A new Priest, " + name + ", has been created!");

        Random rand = new Random();

        strength = 7 + (rand.nextInt(6) + 1);
        intelligence = 15 + (rand.nextInt(6) + 1);
        agility = 8 + (rand.nextInt(6) + 1);
        charisma = 10 + (rand.nextInt(6) + 1);

        hp = maxhp = strength;
        mp = maxmp = intelligence + (charisma * 2);
    }

    public void showStats() {

        System.out.printf("%s, a Priest:\n",name);

        super.showStats();

        System.out.printf("CHA: %3d\n",charisma);
    }


}
