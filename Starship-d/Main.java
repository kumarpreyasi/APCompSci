import java.util.ArrayList;

public class Main {

    ArrayList<String> shipNames;

    public static void main(String[] args) {

        String[] allNames = new String[] {"Reliant","Enterprise","Yorktown","Saratoga","Voyager","Discovery","Constitution","Constellation","Grissom","Defiant","Intrepid","Britaan","Stargazer","Yamato","Galaxy","Ambassador","Nimitz","Equinox","Relativity","Challenger"};

        ArrayList<String> shipNames = new ArrayList<String>();

        for (String s : allNames){

            shipNames.add(s);

        }

        ArrayList<Starship> fleet = new ArrayList<Starship>();

        for (int i = 0; i < 20; i+=4) {

            fleet.add(new Escort(allNames[i]));

            fleet.add(new Frigate(allNames[i + 1]));

            fleet.add(new Cruiser(allNames[i + 2]));

            fleet.add(new Battleship(allNames[i + 3]));

        }

        System.out.println("\nComplete Fleet:");

        for (Starship x : fleet) {

            x.showStats();

        }

        ArrayList<IsDefense> defenseBattalion = new ArrayList<>();

        ArrayList<IsOffense> offenseBattalion = new ArrayList<>();

        int sum, maxIndex;

        for (int i = 0; i < 4; i++) {

            sum = 0;

            maxIndex = 0;

            for (int j = 0; j < fleet.size(); j++) {

                if ((fleet.get(j).hull + fleet.get(j).shield) > sum && fleet.get(j) instanceof IsDefense) {

                    sum = fleet.get(j).hull + fleet.get(j).shield;

                    maxIndex = j;

                }

            }

            defenseBattalion.add(fleet.remove(maxIndex));

        }

        for (int i = 0; i < 4; i++) {

            sum = 0;

            maxIndex = 0;

            for (int j = 0; j < fleet.size(); j++) {

                if ((fleet.get(j).hull + fleet.get(j).shield) > sum && fleet.get(j) instanceof IsOffense) {

                    sum = fleet.get(j).hull + fleet.get(j).shield;

                    maxIndex = j;

                }

            }

            offenseBattalion.add(fleet.remove(maxIndex));

        }

        System.out.println("\nDefense Battalion:");

        for (IsDefense x : defenseBattalion ){

            x.showStats();

        }

        System.out.println("\nOffense Battalion:");

        for (IsOffense x : offenseBattalion ) {

            x.showStats();

        }

    }

}
