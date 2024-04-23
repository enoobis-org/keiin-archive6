public class Warrior extends Hero{
    @Override
    public void applySuperAbility() {
        System.out.println("The warrior makes a " + superAbility);
    }

    public Warrior() {
        super(100, 34, "Slash attack");
    }
}
