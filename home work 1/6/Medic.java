public class Medic extends Hero{
    private int healPoints;

    public int getHealPoints() {
        return healPoints;
    }



    public void increaseExperience(){
        healPoints += (int) (healPoints * 0.1);
    }
    public Medic() {
        super(200, 10, "Healing");
        this.healPoints = 30;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic uses " + superAbility);
    }

}
