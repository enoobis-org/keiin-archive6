public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(100);
        boss.setHealth(700);
        Weapon bossWeapon = new Weapon();
        bossWeapon.setWeaponType(WeaponType.AXE);
        boss.setWeapon(bossWeapon);

        System.out.println("Boss health: " + boss.getHealth());
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Boss weapon: " + boss.getWeapon().getWeaponType());

    }
}
