package game.general;

import game.players.*;

import java.util.Random;

public class RPG_Game {
    public static Random random = new Random();
    private static int roundNumber;

    public static void startGame() {
        Boss boss = new Boss(1000000000, 50, "Dragon");
        Warrior warrior1 = new Warrior(280, 10, "Ishenaly");
        Warrior warrior2 = new Warrior(270, 15, "Temirlan");
        Medic doc = new Medic(250, 5, 15, "Merlin");
        Magic magic = new Magic(290, 20, "Kaasym");
        Berserk berserk = new Berserk(260, 10, "Darika");
        Medic assistant = new Medic(300, 5, 5, "Kanjarbek");
        Witcher witcher = new Witcher(300, 0, "Geralt");
        Hacker hacker = new Hacker(200, 8, "Ainazik");
        King king = new King(150, 0,  "King");
        Kamikaze kamikaze = new Kamikaze(380, 0, "Ace");
        Ludomaniac ludomaniac = new Ludomaniac(2000, 7, "Aidan");
        Hero[] heroes = {berserk, warrior1, warrior2, doc, magic, assistant, witcher, hacker, king, kamikaze, ludomaniac};

        showStatistics(boss, heroes);
        while (!isGameOver(boss, heroes)) {
            playRound(boss, heroes);
        }
    }

    private static void showStatistics(Boss boss, Hero[] heroes) {
        System.out.println("ROUND " + roundNumber + " ----------");
        System.out.println(boss);
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i]);
        }
    }

    private static boolean isGameOver(Boss boss, Hero[] heroes) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        boolean allHeroesDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
        }
        return allHeroesDead;
    }

    private static void playRound(Boss boss, Hero[] heroes) {
        roundNumber++;
        boss.chooseDefence();
        boss.attack(heroes);
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && boss.getHealth() > 0 &&
                    boss.getDefence() != heroes[i].getAbility()) {
                heroes[i].attack(boss);
                heroes[i].applySuperPower(boss, heroes);
            }
        }
        showStatistics(boss, heroes);
    }
}
