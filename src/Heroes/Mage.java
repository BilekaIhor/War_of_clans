package Heroes;

import Enemies.Enemy;

public class Mage extends Hero {

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(40);
        System.out.println(getName() + ", наніс удар вогняним шаром [-20 до HP] чужинця");
    }
}