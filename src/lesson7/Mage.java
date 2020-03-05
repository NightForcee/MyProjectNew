package lesson7;

public class Mage extends Hero {
    Mage(String name, int health, int damage, int defense) {
        super(name, health, damage, defense);
    }

    @Override
    protected void attackEnemy(Enemy a) {
        int damage = 12;
        a.takeDamage(damage);
        System.out.println("Атакую врага своим посохом!!!  мой урон 25");
    }
}
