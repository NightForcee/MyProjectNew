package lesson7;

public class BattleGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Wolk", 100, 10, 1);

        Enemy zombie = new Zombie("BigLoser", 100);
        Enemy vampire = new Vampire("vampirka", 100);

        System.out.println();
        System.out.println("Мое здоровье перед началом боя = " + warrior.getHealth());
        System.out.println();
        warrior.attackEnemy(zombie);
        System.out.println("Здоровье зомби, после удара моего меча = " + zombie.getHealth());

        System.out.println();
        warrior.superSkillWarrior();
        System.out.println("Использую супер способность! " + "Мое здоровье возрасло до " + warrior.getHealth() + ", защита до " + warrior.defense + ", урон до " + warrior.damage);

        System.out.println();
        zombie.attackHero(warrior);
        System.out.println("Зомби атаковал меня и оставил здоровья = " + warrior.getHealth());

        System.out.println();
        vampire.attackHero(warrior);
        System.out.println("Зомби атаковал меня и оставил здоровья = " + warrior.getHealth());

        System.out.println();
        zombie.attackHero(warrior);
        System.out.println("Зомби атаковал меня и оставил здоровья = " + warrior.getHealth());

        System.out.println();
        vampire.superSkillVampire();
        System.out.println("Вампир использовал способность, его здоровье возрасло = " + vampire.getHealth());

        System.out.println();
        zombie.superSkillZombie();
        System.out.println("Зомби использовал способность, его здоровье возрасло = " + vampire.getHealth());

        System.out.println();
        warrior.superSkillWarrior();
        System.out.println("Использую супер способность! " + "Мое здоровье возрасло до " + warrior.getHealth() + ", защита до " + warrior.defense + ", урон до " + warrior.damage);

        System.out.println();
        warrior.attackEnemy(zombie);
        System.out.println("Здоровье зомби после моего удара = " + zombie.getHealth());

        System.out.println();
        warrior.attackEnemy(vampire);
        System.out.println("Здоровье вампира после моего удара = " + vampire.getHealth());

    }
}
