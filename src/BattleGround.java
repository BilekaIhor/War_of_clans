import Enemies.Damn;
import Enemies.Enemy;
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

        Enemy enemy = new Enemy(100);

        kamikaze.attackHero(warrior);
        warrior.attackHero(archer);
        mage.attackEnemy(kamikaze);
        damn.attackHero(archer1);
        archer1.attackEnemy(damn);

        damn.canResurrect();
    }
}