package lesson7;

public class Warrior extends Hero {

    Warrior(String name, int health, int damage, int defense) {
        super(name, health, damage, defense);
    }

    @Override
    public void attackEnemy(Enemy a) {
        int damage;
        damage = this.damage;
        a.takeDamage(damage);
        System.out.println("Атакую врага своим мечем!!! Мой урон: " + damage);
    }


    @Override
    public void attackEnemy() {
    }

    @Override
    public void attackHero() {
    }
}
