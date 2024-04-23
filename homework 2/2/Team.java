public class Team {
    private int height;
    private Positions position;
    private String name;

    public String getName() {
        return name;
    }

    public Team(int height, Positions position, String name) {
        this.height = height;
        this.position = position;
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public Positions getPosition() {
        return position;
    }
}
