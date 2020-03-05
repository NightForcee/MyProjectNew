package lesson7;

public class Zombie extends Enemy {
    Zombie(String name, int health) {
        super(name, health);
    }

    @Override
    void attackHero(Hero a) {
        int attack = 5;
        a.takeDamage(attack);
        System.out.println("Атакую героя, Грх-грх!!!!  мой урон 5");
    }
}
