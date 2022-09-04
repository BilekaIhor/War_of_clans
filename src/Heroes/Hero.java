package Heroes;

import Enemies.Enemy;

public abstract class Hero extends Enemy {
    protected String name;

    public Hero(String name, int health) {
        super(health);
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);
}