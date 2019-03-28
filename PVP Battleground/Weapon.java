public class Weapon {

    private int damage, strength, agility, critical;

    private boolean range;

    String weapon;

    Weapon(int d, int s, int c, boolean r, String weaponName) {

        damage = d;
        critical = c;
        range = r;

        if (r){
            agility = s;
            strength = 0;
        }
        else {
            agility = 0;
            strength = s;
        }

        weapon = weaponName;

    }

}
