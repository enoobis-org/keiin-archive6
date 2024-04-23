public class Game {
    private String gameTitle;
    private GameStudio studio;

    public String getGameTitle() {
        return gameTitle;
    }

    public GameStudio getStudio() {
        return studio;
    }

    public Game(String gameTitle, GameStudio studio) {
        this.gameTitle = gameTitle;
        this.studio = studio;
    }
}
