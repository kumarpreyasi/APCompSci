public class Cruiser extends Starship implements IsOffense {

    public Cruiser(String name){

        registry = name;

        hullRange = new int[] {2000, 2500};

        shieldRange = new int[] {2000, 2500};

        beamRange = new int[] {3000, 4000};

        torpedoRange = new int[] {20, 35};

        hull = getRand(hullRange);

        shield = getRand(shieldRange);

        beam = getRand(beamRange);

        torpedo = getRand(torpedoRange);

    }

}
