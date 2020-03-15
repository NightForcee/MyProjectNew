package lesson007;

public abstract class Enemy implements Mortal {
    private String name;
    private int health;
    int damage;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    Enemy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void takeDamage(int damage) {
        health = health - damage;
    }

    public abstract void attackHero(Hero a);

    public String getName() {
        return name;
    }

    void superSkillZombie() {
        int c = 70;
        health = c;
        System.out.println("Я возродился, ГРХ-ГРХ");
    }


    @Override
    public boolean isAlive() {
        if (health > 0) {
            return true;
        }
        return false;
    }
}

