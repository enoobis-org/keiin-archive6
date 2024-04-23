public class VideoGame extends Game{
    private int releaseYear;

    public VideoGame(String gameTitle, GameStudio studio, int releaseYear) {
        super(gameTitle, studio);
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
    public void displayGameInfo() {
        System.out.println("Video Game: " + getGameTitle() + ", Studio: " + getStudio().getStudioName() + ", Release Year: " + releaseYear);
    }

    public void displayGameInfo(GameGenre genre) {
        System.out.println("Video Game: " + getGameTitle() + ", Studio: " + getStudio().getStudioName() + ", Release Year: " + releaseYear + ", Genre: " + genre);
    }

    // Неперезаписываемый метод
    public final void onlyVideoGame() {
        System.out.println("Only on ps5");
    }
}
