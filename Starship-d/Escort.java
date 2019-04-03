public class Escort extends Starship implements IsDefense {

    public Escort(String name){

        registry = name;

        hullRange = new int[] {1000, 1250};

        shieldRange = new int[] {2500, 3500};

        beamRange = new int[] {2500, 3000};

        torpedoRange = new int[] {10, 20};

        hull = getRand(hullRange);

        shield = getRand(shieldRange);

        beam = getRand(beamRange);

        torpedo = getRand(torpedoRange);

    }

}
