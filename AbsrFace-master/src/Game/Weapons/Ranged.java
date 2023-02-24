package Game.Weapons;

import Game.Weapons.Weaponable;

public class Ranged implements Weaponable {

    private String weaponName;

    private int damagePoint;

    private int range;

    public int getRange() {
        return range;
    }

    public Ranged(String weaponName, int damagePoint, int range) {
        this.weaponName = weaponName;
        this.damagePoint = damagePoint;
        this.range = range;
    }

    @Override
    public String toString() {
        return "Ranged{" +
                "weaponName='" + weaponName + '\'' +
                ", damagePoint=" + damagePoint +
                ", range=" + range +
                '}';
    }

    @Override
    public int damage() {
        return damagePoint;
    }
}
