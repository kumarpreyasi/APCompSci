public class Weapon {

    private int damage, strength, agility, critical;
   
    private boolean range;
   
    String n;

    Weapon(int d, int s, int c, boolean r, String weapon) {

        int damage = d;
        int critical = c;
        boolean range = r;

        if (r){
            agility = s; 
            strength = 0;
        }
        else {
            agility = 0; 
            strength = s;
        }

        String n = weapon;

    }

}
