public class Enemy implements Mortal{
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

    public int takeDamage(int damage) {
        setHealth(getHealth() - damage);
        return health;
    }

    @Override
    public boolean isAlive(){
        return (getHealth() > 0);
    }
}
