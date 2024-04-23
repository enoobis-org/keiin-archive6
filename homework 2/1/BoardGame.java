public final class BoardGame extends VideoGame{
    private int minPlayers;
    private int maxPlayers;

    public BoardGame(String gameTitle, GameStudio studio, int releaseYear, int minPlayers, int maxPlayers) {
        super(gameTitle, studio, releaseYear);
        this.maxPlayers = maxPlayers;
        this.minPlayers = minPlayers;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }
    public void displayGameInfo() {
        System.out.println("Board Game: " + getGameTitle() + ", Studio: " + getStudio().getStudioName() + ", Min Players: " + minPlayers + ", Max Players: " + maxPlayers);
    }


}
