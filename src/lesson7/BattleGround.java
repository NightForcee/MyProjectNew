package lesson7;

public abstract class BattleGround implements Mortal {
    public static void main(String[] args) {
        Hero[] team1 = new Hero[2];
        team1[0] = new Warrior("warrior", 100, 20, 4);
        team1[1] = new Mage("mage", 100, 18, 3);

        Enemy[] team2 = new Enemy[2];
        team2[0] = new Zombie("zombie", 100, 14);
        team2[1] = new Vampire("vampire", 100, 13);

        while (team2[0].isAlive() && team1[0].isAlive()) {
            if (team1[0].getHealth() <= 40) {
                team1[0].superSkillWarrior();
            }
            if (team1[0].isAlive()) {
                team1[0].attackEnemy(team2[0]);
                team1[0].attackEnemy(team2[1]);
            } else System.out.println("Воин умер...");
            if (team1[1].isAlive()) {
                team1[1].attackEnemy(team2[0]);
                team1[1].attackEnemy(team2[1]);
            } else System.out.println("Маг умер...");
            if (team1[0].isAlive() && team1[1].isAlive()) {
            } else {
                System.out.println("Команда Героев умерла...");
                break;
            }
            if (team2[0].isAlive()) {
                team2[0].attackHero(team1[0]);
                team2[0].attackHero(team1[1]);
            } else System.out.println("Зомби умер...");
            if (team2[0].getHealth() <= 0) {
                int count = 0;
                while (count == 0) {
                    count++;
                    team2[0].superSkillZombie();
                }
                continue;
            }
            if (team2[1].isAlive()) {
                team2[1].attackHero(team1[0]);
                team2[1].attackHero(team1[1]);
            } else System.out.println("Вампир умер...");
            if (team2[0].isAlive() && team2[1].isAlive()) {
            } else {
                System.out.println("Команда Противников умерла...");
                break;
            }
        }
    }
}