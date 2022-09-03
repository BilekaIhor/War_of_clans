package Heroes;

public abstract class Hero extends Enemy {
    private String name;

    public Hero(String name, int health) {
        super(health);
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);
}