public class Enemy implements Mortal {
    public int health;

    public Enemy (int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth (int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        setHealth(getHealth() - damage);
    }

    public void attackHero(Hero hero){
        hero.takeDamage(3);
        System.out.println("Чужинець, наніс удар рукою по "+ hero.getName() +"у [-3 до HP] противника");
    }

    @Override
    public boolean isAlive(){
        return (getHealth() > 0);
    }
}