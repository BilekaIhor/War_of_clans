package Enemies;

import Heroes.Hero;

public class Kamikaze extends Enemy {

    public Kamikaze(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(80);
        Kamikaze.this.setHealth(getHealth() - 80);
        System.out.println("Смертник, жертвує собою в бою [-80 до HP] героя");
    }
}