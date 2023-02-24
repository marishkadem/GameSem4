package Game;
import Game.Shields.Assault;
import Game.Weapons.Sword;
import Game.Shields.Shield;
import Game.Shields.NullShield;
public class Main {

    public static void main(String[] args) {

        Team<Footman> squadF = new Team<>();

        squadF.add(new Footman("joe",50 ,new Sword(30,new Assault(15,25))));
        squadF.add(new Footman("moe",45 , new Sword(10,new Assault(25,20))));
        squadF.add(new Footman("doe",65 , new Sword(25,new Assault(10,15))));

        for (Footman item : squadF) {
            System.out.println(item);
        }

        System.out.println(squadF.maxTeamRange());
        System.out.println(squadF.minArmor());


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Team<BaseHero> squadA = new Team<>();

        squadA.add(new Archer("Bob",40 ,new Sword(30,new Assault(15,25))));
        squadA.add(new Archer("Rob",75 ,new Sword(30,new Assault(15,25))));
        squadA.add(new Footman("Tor",30 ,new Sword(30,new Assault(15,25))));
        squadA.add(new Footman("Ron",15 ,new Sword(30,new Assault(15,25))));

        for (BaseHero item : squadA) {
            System.out.println(item);
        }

        System.out.println(squadF.maxTeamRange());
        System.out.println(squadF.minArmor());

        Footman footman1 = new Footman("marks",77   , new Sword(40, new Assault(30, 50)));
        Footman footman2 = new Footman("adamS" ,66  , new Sword(35, new Assault(25, 35)));
        while (footman1.getHealth()>0 && footman2.getHealth()> 0){
            footman1.hit(footman2);
            System.out.println(footman2);
            System.out.println("~~~~~~~~");
            footman2.hit(footman1);
            System.out.println(footman1);
            System.out.println("____________");


        }

        if (footman1.getHealth()>0){

            System.out.println(footman1 + " is Winner");
        }
        else {
            System.out.println(footman2 + " is Winner");
        }
    }

}
