public class Player3 extends Team implements Printable{
    private Positions additionalPosition;

    public Positions getAdditionalPosition() {
        return additionalPosition;
    }

    public Player3(int height, Positions position, String name, Positions additionalPosition) {
        super(height, position, name);
        this.additionalPosition = additionalPosition;
    }

    @Override
    public void print() {
        System.out.println("Name " + getName()  + "\nHeight " + getHeight() + "\nPosition " + getPosition() +
                "\nAdditional position " + getAdditionalPosition());
    }
}
