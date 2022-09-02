public abstract class Hero {
    public String name;

    public Hero (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);

}
