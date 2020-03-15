package lesson007;

public abstract class Hero implements Mortal {
    private String name;
    private int health;
    int damage;
    int defense;


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    Hero(String name, int health, int damage, int defense) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.defense = defense;
    }

    void superSkillWarrior() {
        this.damage += 5;
        this.health += 5;
        System.out.println("super skill!!!");
    }


    public void takeDamage(int damage) {
        health = health - (damage - defense);
    }

    @Override
    public boolean isAlive() {
        if (health > 0) {
            return true;
        }
        return false;
    }

    public abstract void attackEnemy(Enemy a);
}
