package Game;

import Game.Weapons.Sword;
import Game.Weapons.Weaponable;
import org.jetbrains.annotations.NotNull;

import java.util.Random;


public abstract class BaseHero <W extends Weaponable>  {


    private int health;

    private String name;

    protected W weapon;

    protected BaseHero(String name, int health, Sword sword) {
        this.health = health;
        this.name = name;
        this.weapon = (W) sword;
    }

    public int damageFork(){
        Random random = new Random();
        return random.nextInt(weapon.damage());

    }

    public boolean hit(@NotNull BaseHero recipient){
        int damage = damageFork();

        return ! recipient.reduceHealth(damage);


    }

    public boolean reduceHealth(int damage){
        health -= damage;
        return health>0;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public W getWeapon() {
        return weapon;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "BaseHero{" +
                "health=" + health +
                ", name='" + name + '\'' +
                ", weapon=" + weapon +
                '}';
    }
}
