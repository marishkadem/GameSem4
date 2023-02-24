package Game;
import Game.Shields.Shield;
import Game.Shields.Shieldable;
import Game.Weapons.Melee;
import Game.Shields.NullShield;
import Game.Weapons.Sword;

public class Footman extends BaseHero implements Shieldable {

    private Shield shield = NullShield.getInstance();

    public Footman(String name, int health, Sword sword) {
        super(name, health, sword);
    }
    public Footman(String name, int health, Sword sword, Shield shield) {
        this(name, health, sword);
        this.shield = shield;
    }


    @Override
    public String toString() {
        return "Footman{" +
                "} " + super.toString();
    }

    @Override
    public int sizeShield() {
        return shield.getSize();
    }

    @Override
    public int armor() {
        return shield.getArmorReserve();
    }

    @Override
    public Shield getShield() {
        return shield;
    }
}
