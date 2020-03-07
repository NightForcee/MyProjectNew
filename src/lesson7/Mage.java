package lesson7;

public class Mage extends Hero {
    Mage(String name, int health, int damage, int defense) {
        super(name, health, damage, defense);
    }

    @Override
    public void attackEnemy(Enemy a) {
        int damage;
        damage = this.damage;
        a.takeDamage(damage);
        System.out.println("Атакую врага своим посохом!!!  мой урон: " + damage);
    }

    @Override
    public void attackEnemy() {
    }

    @Override
    public void attackHero() {
    }
}
