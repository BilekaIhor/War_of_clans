import Characters.Damn;
import Characters.Kamikaze;
import Characters.Archer;
import Heroes.Enemy;
import Characters.Mage;
import Characters.Warrior;

public class BattleGround {
    public static void main(String[] args){

        Mage mage = new Mage("Стрейндж", 100);
        Warrior warrior = new Warrior("Воїн", 100);
        Archer archer = new Archer("Робін", 100);
        Archer archer1 = new Archer("Скаді", 100);

        Enemy enemy = new Enemy(100);
        Damn damn = new Damn(100);
        Kamikaze kamikaze = new Kamikaze(100);


    }
}