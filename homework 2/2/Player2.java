public class Player2 extends Team implements Printable {
    private String comand;

    public String getComand() {
        return comand;
    }

    public Player2(int height, Positions position, String name, String comand) {
        super(height, position, name);
        this.comand = comand;
    }

    @Override
    public void print() {
        System.out.println("Name " + getName()  + "\nHeight " + getHeight() + "\nPosition " + getPosition() +
                "\nCommand " + getComand());
    }
}
