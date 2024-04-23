package game.players;

import game.general.RPG_Game;

public class Hacker extends Hero {


    public Hacker(int health, int damage, String name) {
        super(health, damage, SuperAbility.CHEATING, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) { //Как сделать так чтобы он проводил суперспособность через раз?
        int cheating = RPG_Game.random.nextInt(100); //Здоровье которое заберем у Босса
        int randomHero = RPG_Game.random.nextInt(heroes.length);//Рандомный герой
        boss.setHealth(boss.getHealth() - cheating);//Отнимаем здоровье
        heroes[randomHero].setHealth(heroes[randomHero].getHealth() + cheating);//Прибавляем здоровье
        System.out.println("Hacker " + this.getName() + " took the boss's health " +
                cheating + " and gave " + heroes[randomHero].getName());
    }
//public class Hacker extends  Hero{
//    public Hacker(int health, int damage, String name) {
//        super(health, damage,SuperAbility.CHEATING, name);
//    }
//
//    @Override
//    public void applySuperPower(Boss boss, Hero[] heroes) {
//        int damage = boss.getHealth() -  RPG_Game.random.nextInt(200);
//        for (int i = 0; i < heroes.length; i++) {
//            i = RPG_Game.random.nextInt(heroes.length);
//            heroes[i].setHealth(heroes[i].getHealth() + damage);
//            System.out.println("Hacker take health boss");
//            break;
//        }
//    }
}

