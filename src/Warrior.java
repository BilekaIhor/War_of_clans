public class Warrior extends Hero {

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(30);
        System.out.println(getName() + ", наніс удар мечем [-5 до HP] чужинця");
    }
}