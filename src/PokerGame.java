import java.util.ArrayList;
import java.util.Random;

public class PokerGame {
    private ArrayList<Player> players = new ArrayList<>();
    private int buttonPlayer;

    public PokerGame(int numberOfplayers) {
        for (int i = 0; i < numberOfplayers; i++) {
            players.add(new Player("Player "+(i)));
        }
    }
    public void showPlayers(){
        for (Player player : players) {
            System.out.println(player);
        }
    }

    public int getButtonPlayer() {
        return buttonPlayer;
    }

    public void setButtonPlayer(int buttonPlayer) {
        if(buttonPlayer >= 0 && buttonPlayer <= players.size()){
            players.get(this.buttonPlayer).setButton(false);
            this.buttonPlayer = buttonPlayer;
            players.get(buttonPlayer).setButton(true);
        }
    }
    public void setRandomButtonPlayer(){
        Random random = new Random();
        setButtonPlayer(random.nextInt(players.size()));
    }
}
