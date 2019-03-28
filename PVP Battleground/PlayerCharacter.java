public abstract class PlayerCharacter {

    protected String name;

    protected int strength, intelligence, agility, hp, maxhp, mp, maxmp;

    private static int count;

    public PlayerCharacter() {

        System.out.println("A new PlayerCharacter!");
        count++;

    }

    public void showStats() {

        System.out.printf(" HP: %3d/%3d\n", hp, maxhp);
        System.out.printf(" MP: %3d/%3d\n", mp, maxmp);
        System.out.printf("STR: %3d\nINT: %3d\nAGI: %3d\n",strength,intelligence,agility);

    }

    public static int numCharacters() {

        return count;

    }


}
