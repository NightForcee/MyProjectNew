package lesson007;

public class Vampire extends Enemy {
    Vampire(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attackHero(Hero a) {
        int attack;
        attack = this.damage;
        a.takeDamage(attack);
        System.out.println("Я вампир, я выпью всю твою кровь!!!!  мой урон: " + damage);
    }

    @Override
    public void attackEnemy() {
    }

    @Override
    public void attackHero() {
    }
}
