public class Spell {

    private int damage, mana, critical, intelligence;

    boolean frozen;

    String spell;

    Spell (int newDamage, int newMana, int newCrit, int newInt, boolean isFrozen, String spellName) {

        damage = newDamage;
        mana = newMana;
        critical = newCrit;
        intelligence = newInt;
        frozen = isFrozen;
        spell = spellName;

    }

}
