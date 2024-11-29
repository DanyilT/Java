import exceptions.InsufficientChipsException;
import game.BlackjackGame;

public class Main {
    public static void main(String[] args) {
        try {
            // Check if in game_data.yaml is players exist, check if they have correct structure (name, chips, bets, hands, count_values), if have incorect data remove this player and add new player with correct data
            BlackjackGame game = new BlackjackGame();
        } catch (InsufficientChipsException e) {
            throw new RuntimeException(e);
        }
    }
}
