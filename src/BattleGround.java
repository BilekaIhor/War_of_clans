import Enemies.Damn;
import Enemies.Kamikaze;
import Heroes.Archer;
import Heroes.Mage;
import Heroes.Warrior;

public class BattleGround {
    public static void main(String[] args){

        Mage mage = new Mage("Стрейндж", 100);
        Warrior warrior = new Warrior("Леонід", 100);
        Archer archer = new Archer("Робін", 100);
        Archer archer1 = new Archer("Скаді", 100);

        Damn damn = new Damn(100);
        Kamikaze kamikaze = new Kamikaze(100);

        kamikaze.attackHero(warrior);
        System.out.println(warrior.getHealth());
        System.out.println(warrior.isAlive());
        System.out.println(kamikaze.getHealth());
    }
}