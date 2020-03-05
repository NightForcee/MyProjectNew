package lesson7;

public abstract class Enemy implements Mortal {
    private String name;
    private int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage) {
        health = health - damage;
    }

    abstract void attackHero(Hero a);

    public String getName() {
        return name;
    }

    public void superSkillZombie() {
        health += 5;
    }

    public void superSkillVampire() {
        health += 10;
    }

    @Override
    public boolean isAlive() {
        if (health > 0) {
            return true;
        }
        return false;
    }
}
