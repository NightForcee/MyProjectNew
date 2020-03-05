package lesson7;

public class Archer extends Hero {
    Archer(String name, int health,int damage,int defense) {
        super(name, health,damage,defense);
    }

    @Override
    protected void attackEnemy(Enemy a) {
        int damage = 8;
        a.takeDamage(damage);
        System.out.println("Атакую врага своим луком!!! мой урон 15");
    }
}
