public class Battleship extends Starship implements IsOffense {

    public Battleship(String name){

        registry = name;

        hullRange = new int[] {3000, 5000};

        shieldRange = new int[] {1500, 2000};

        beamRange = new int[] {4000, 5000};

        torpedoRange = new int[] {40, 50};

        hull = getRand(hullRange);

        shield = getRand(shieldRange);

        beam = getRand(beamRange);

        torpedo = getRand(torpedoRange);

    }

}
