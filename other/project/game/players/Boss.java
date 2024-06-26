package game.players;

import game.general.RPG_Game;

public class Boss extends GameEntity {
    private SuperAbility defence;

    public Boss(int health, int damage, String name) {
        super(health, damage, name);
    }

    public SuperAbility getDefence() {
        return defence;
    }

    public void chooseDefence() {
        SuperAbility[] abilities = SuperAbility.values();
        int randomIndex = RPG_Game.random.nextInt(abilities.length);
        this.defence = abilities[randomIndex];
    }

    public void attack(Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                if (heroes[i] instanceof Berserk &&
                        this.getDefence() != SuperAbility.BLOCK_DAMAGE_AND_REVERT) {
                    ((Berserk) heroes[i]).setBlockedDamage(this.getDamage() / 5);
                    heroes[i].setHealth(heroes[i].getHealth() -
                            (this.getDamage() - ((Berserk) heroes[i]).getBlockedDamage()));
                } else {
                    heroes[i].setHealth(heroes[i].getHealth() - this.getDamage());
                }
            }
        }
    }

    @Override
    public String toString() {
        return "BOSS " + super.toString() + " DEFENCE: " + this.defence;
    }
}
