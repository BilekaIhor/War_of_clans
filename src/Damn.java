public class Damn extends Enemy{

    public Damn(int health) {
        super(health);
    }

    private void canResurrect() {
        if(!isAlive()){
            setHealth(100);
        } else
        {
            System.out.println("Проклятий, відійшов у вічність");
        }
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(20);
        System.out.println("Проклятий, наніс удар герою [-20 до HP] противника");
    }
}