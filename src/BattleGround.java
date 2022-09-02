public class BattleGround {
    public static void main(String[] args){
        Mage mage = new Mage("Маг");
        Enemy enemy = new Enemy(100);

        mage.attackEnemy(enemy);
        System.out.println(enemy.getHealth());
        System.out.println(enemy.isAlive());
    }
}
