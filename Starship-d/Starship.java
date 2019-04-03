import java.util.Random;

public abstract class Starship implements IsDefense, IsOffense {

    protected int hull, shield, beam, torpedo;

    protected static int[] hullRange;

    protected static int[] shieldRange;

    protected static int[] beamRange;

    protected static int[] torpedoRange;

    protected String registry;


    protected int getRand(int[] range) {

        Random rand = new Random();

        return rand.nextInt(range[1] - range[0]) + range[0];

    }

    public void showStats() {

        System.out.println(registry + ":\tHull: " + hull + "\tShields: " + shield + "\tBeam Weapons: " + beam + "\tTorpedoes: " + torpedo);

    }

}
