package lesson7;

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

    void superSkillWarrior() {
        health += 10;
        defense += 2;
        damage += 10;
    }

    protected abstract void attackEnemy(Enemy a);
}
