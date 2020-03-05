package lesson7;

public class Vampire extends Enemy {
    Vampire(String name, int health) {
        super(name, health);
    }
    void attackHero(Hero a){
        int attack = 15;
        a.takeDamage(attack);
        System.out.println("Я вампир, я выпью всю твою кровь!!!!  мой урон 15");
    }
}
