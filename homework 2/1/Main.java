public class Main {
    public static void main(String[] args) {
        VideoGame game1 = new VideoGame("Assassin's Creed", new GameStudio("Ubisoft", "Christian Guillemot"), 2007);

        // Создаем 2 объекта класса 3-го уровня
        BoardGame game2 = new BoardGame("Settlers of Catan", new GameStudio("Catan GmbH", "Klaus Teuber"),2015, 3, 4);
        BoardGame game3 = new BoardGame("Ticket to Ride", new GameStudio("Days of Wonder", "Alan R. Moon"),2010, 2, 5);

        // Выводим свойства объектов
        System.out.println("Game 1: " + game1.getGameTitle() + ", Release Year: " + game1.getReleaseYear());
        game1.displayGameInfo();
        game1.onlyVideoGame();

        System.out.println("\nGame 2: " + game2.getGameTitle() + ", Min Players: " + game2.getMinPlayers() + ", Max Players: " + game2.getMaxPlayers());
        game2.displayGameInfo();

        System.out.println("\nGame 3: " + game3.getGameTitle() + ", Min Players: " + game3.getMinPlayers() + ", Max Players: " + game3.getMaxPlayers());
        game3.displayGameInfo();
    }

}