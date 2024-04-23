public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {new Magic(), new Medic(), new Warrior()};

        for (Hero hero: heroes){
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
                System.out.println("Опыт лечения Medic: " + ((Medic) hero).getHealPoints());
            }
        }
    }
}