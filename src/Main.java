public class Main {
    public static void main(String[] args) {
        PokerGame game = new PokerGame(5);
        game.showPlayers();
        System.out.println("------------");
        game.setRandomButtonPlayer();
        game.showPlayers();
        System.out.println("------------");
        game.setRandomButtonPlayer();
        game.showPlayers();
        System.out.println("------------");


    }
}
