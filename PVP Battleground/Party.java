public class Party {

    private Tank Tank;
    private Range Range;
    private Healer Healer;

    public Party() {


    }

    public void showStats() {

        System.out.println("Tank: ");
        Tank.showStats();

        System.out.println("Range: ");
        Range.showStats();

        System.out.println("Healer: ");
        Healer.showStats();

    }

    public void addPlayer(Tank t){
       
        Tank = t;

    }

    public void addPlayer(Healer h){
     
        Healer = h;

    }

    public void addPlayer(Range r){

        Range = r;

    }


}

//from what we did in class
