public class Archer extends Hero {

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(15);
        System.out.println(getName() + ", наніс постріл з арбалету [-15 до HP] чужинця");
    }
}