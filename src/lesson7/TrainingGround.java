package lesson7;

public class TrainingGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Wolk", 100, 10, 1);

        Enemy zombie = new Zombie("BigLoser", 100);
        Enemy vampire = new Vampire("vampirka", 100);

        if (warrior.isAlive()) {
            warrior.superSkillWarrior();
            System.out.println("Super skill!!!!" + "HP = " + warrior.getHealth() + " deff = " + warrior.defense + " my damage " + warrior.damage);
            warrior.attackEnemy(zombie);
            System.out.println("HP zombie = " + zombie.getHealth());
            warrior.attackEnemy(vampire);
            System.out.println("HP vampire = " + vampire.getHealth());
            warrior.attackEnemy(zombie);
            System.out.println("HP zombie = " + zombie.getHealth());
            warrior.attackEnemy(vampire);
            System.out.println("HP vampire = " + vampire.getHealth());
            vampire.attackHero(warrior);
            System.out.println("HP warrior = " + warrior.getHealth());
            zombie.attackHero(warrior);
            System.out.println("HP warrior = " + warrior.getHealth());
            vampire.attackHero(warrior);
            System.out.println("HP warrior = " + warrior.getHealth());
            zombie.attackHero(warrior);
            System.out.println("HP warrior = " + warrior.getHealth());
            if (warrior.getHealth() <= 70) {
                warrior.superSkillWarrior();
                System.out.println("Super skill!!!!" + "HP = " + warrior.getHealth() + " deff = " + warrior.defense + " my damage " + warrior.damage);
            }
            if (zombie.getHealth() <= 30) {
                zombie.superSkillZombie();
                System.out.println("Zombie super skill!");
            }
            if (vampire.getHealth() <= 30) {
                vampire.superSkillVampire();
                System.out.println("Vampire super skill!");
            }
        }
    }
}
