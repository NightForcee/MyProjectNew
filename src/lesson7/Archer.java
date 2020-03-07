/**
 * Создать класс
 * Hero, представляющий собой героя и содержащий поле name.
 * Добавить конструктор, принимающий имя героя и геттер для имени (сеттер не нужен).
 * Добавить метод attackEnemy (), выводящий в консоль сообщение о том, что герой атакует врага.
 * Создать класс TrainingGround, содержащий метод main. Протестировать создание героя и его атаку.
 *
 * @autour Slidenko Artem
 * * @version lesson7
 */

package lesson7;

public class Archer extends Hero {
    Archer(String name, int health, int damage, int defense) {
        super(name, health, damage, defense);
    }

    @Override
    public void attackEnemy(Enemy a) {
        int damage = 8;
        a.takeDamage(damage);
        System.out.println("Атакую врага своим луком!!! мой урон 15");
    }

    @Override
    public void attackEnemy() {
    }

    @Override
    public void attackHero() {
    }
}
