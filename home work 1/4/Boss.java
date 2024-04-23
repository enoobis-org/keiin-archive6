public class Boss {
    private int bossDamage;
    private int bossHealth;
    private String bossTypeOfProtection;

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        if (bossDamage <= 0) {
            System.out.println();
        } else {
            this.bossDamage = bossDamage;
        }
    }

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        if (bossHealth <= 0){
            System.out.println("The health must be greater than 0");
        }else {
            this.bossHealth = bossHealth;
        }

    }

    public String getBossTypeOfProtection() {
        return bossTypeOfProtection;
    }

    public void setBossTypeOfProtection(String bossTypeOfProtection) {
        this.bossTypeOfProtection = bossTypeOfProtection;
    }
}
