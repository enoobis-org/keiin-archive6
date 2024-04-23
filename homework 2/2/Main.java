public class Main {
    public static void main(String[] args) {
        Printable printable1 = createObject("Player1");
        Printable printable2 = createObject("Player2");
        Printable printable3 = createObject("Player3");

        Printable[] team = {printable1, printable3, printable2};

        for (Printable printable : team) {
            printable.print();
            System.out.println();
        }
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "Player1":
                Player1 player1 = new Player1(200, Positions.MIDDLE_BLOCKER, "Anton", 24);
                return player1;
            case "Player2":
                Player2 player2 = new Player2(180, Positions.LIBERO, "Ivan", "Panasonic Panthers");
                return player2;
            case "Player3":
                Player3 player3 = new Player3(190, Positions.SETTER, "Timur", Positions.OUTSIDE_HITTER);
                return player3;
            default:
                System.out.println("Error");
        }
        return null;
    }
}
