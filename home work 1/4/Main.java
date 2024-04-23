public class Main {
   public static void main(String[] args){
      Boss boss = new Boss();
      boss.setBossHealth(700);
      boss.setBossDamage(90);
      boss.setBossTypeOfProtection("Fire");


      System.out.println("Information of boss:");
      System.out.println("Health: " + boss.getBossHealth());
      System.out.println("Damage: " + boss.getBossDamage());
      System.out.println("Protection: " + boss.getBossTypeOfProtection());
      System.out.println();
      System.out.println("Information of Heroes:");
      Hero[] heroes = createHeroes();
      for (int i = 0; i < heroes.length; i++) {
         System.out.println("Health: " + heroes[i].getHeroHealth());
         System.out.println("Damage: " + heroes[i].getHeroDamage());
         System.out.println("Super Power: " + heroes[i].getHeroSuperpower());
         System.out.println("------------");
      }

   }
   public static Hero[] createHeroes(){
      Hero knight = new Hero(300, 30, "Swordsman");
      Hero wizard = new Hero(200, 40, "Magic");
      Hero human = new Hero(100, 9);
      return new Hero[]{knight, wizard, human};
   }
}