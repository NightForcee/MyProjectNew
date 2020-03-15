package lesson007;

public class Zombie extends Enemy {
    Zombie(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attackHero(Hero a) {
        int attack;
        attack = this.damage;
        a.takeDamage(attack);
        System.out.println("Атакую героя, Грх-грх!!!!  мой урон: " + damage);
    }

    @Override
    public void attackEnemy() {
    }

    @Override
    public void attackHero() {
    }
}
