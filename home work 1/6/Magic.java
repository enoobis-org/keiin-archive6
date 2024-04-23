public class Magic extends Hero{
    public Magic() {
        super(33, 77, "Fireball");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic uses " + superAbility);
    }
}
