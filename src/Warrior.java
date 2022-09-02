public class Warrior extends Hero {

    public Warrior (String name) {
        super(name);

    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(5);
        System.out.println(getName() + ", наніс удар мечем чужинцю " + enemy + "-5 HP");
    }
}