package Enemies;

import Heroes.Hero;

public class Damn extends Enemy {

    public Damn(int health) {
        super(health);
    }

    public void canResurrect() {
        if(!isAlive()){
            setHealth(100);
        } else
        {
            System.out.println("Проклятий, ще може битися");
        }
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(20);
        System.out.println("Проклятий, наніс удар " + hero.getName() + " [-20 до HP] героя");
    }
}