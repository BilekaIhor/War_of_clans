public class Mage extends Hero{

    public Mage (String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        enemy.takeDamage(20);
        System.out.println(getName() + ", наніс удар вогняним шаром по чужинцю " + "-20 HP");
    }

}
