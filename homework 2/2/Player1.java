public class Player1 extends Team implements Printable{
    private int age;

    public int getAge() {
        return age;
    }

    public Player1(int height, Positions position, String name, int age) {
        super(height, position, name);
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println("Name " + getName()  + "\nHeight " + getHeight() + "\nPosition " + getPosition() +
                "\nAge " + getAge() );
    }
}
