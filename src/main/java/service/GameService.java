package service;
import model.Game;
import model.GameStatus;
import model.Player;

import java.util.UUID;

public class GameService {
    public Game createGame(Player player){
        Game game = new Game();
        game.setBoard(new int[3][3]);
        game.setGameId(UUID.randomUUID().toString());
        game.setPlayer1(player);
        game.setStatus(GameStatus.NEW);
        return game;
    }
}
