public class Hero {
    private int heroHealth;
    private int heroDamage;
    private String heroSuperpower;

    public Hero(int heroHealth, int heroDamage, String heroSuperpower) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.heroSuperpower = heroSuperpower;
    }

    public Hero(int heroHealth, int heroDamage) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public String getHeroSuperpower() {
        return heroSuperpower;
    }
}
