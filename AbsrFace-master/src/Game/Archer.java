package Game;

import Game.Shields.Assault;
import Game.Weapons.Ranged;
import Game.Weapons.Sword;

public class Archer extends BaseHero<Ranged>{
    public Archer(String name, int health, Sword sword) {
        super(name, health, sword);

    }

    public  int range(){
        return  weapon.getRange();
    }

    @Override
    public String toString() {
        return "Archer{" +
                "weapon=" + weapon +
                "} " + super.toString();
    }
}
