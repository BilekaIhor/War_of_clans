package Enemies;

import Heroes.Hero;

public class Enemy implements Mortal {
    protected int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        setHealth(getHealth() - damage);
    }

    public void attackHero(Hero hero) {
        hero.takeDamage(20);
        System.out.println("Нежить, наніс удар рукою по "+ hero.getName() +"у");
    }

    @Override
    public boolean isAlive(){
        return (getHealth() > 0);
    }
}