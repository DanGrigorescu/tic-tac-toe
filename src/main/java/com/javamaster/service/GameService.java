package com.javamaster.service;
import com.javamaster.exception.InvalidGameException;
import com.javamaster.exception.InvalidParamException;
import com.javamaster.exception.NotFoundException;
import com.javamaster.model.Game;
import com.javamaster.model.GameStatus;
import com.javamaster.model.Player;
import com.javamaster.storage.GameStorage;

import java.util.UUID;

import static com.javamaster.model.GameStatus.IN_PROGRESS;
import static com.javamaster.model.GameStatus.NEW;

public class GameService {
    public Game createGame(Player player){
        Game game = new Game();
        game.setBoard(new int[3][3]);
        game.setGameId(UUID.randomUUID().toString());
        game.setPlayer1(player);
        game.setStatus(GameStatus.NEW);
        GameStorage.getInstace().setGame(game);
        return game;
    }
    public Game connectToGame(Player player2, String gameId) throws InvalidParamException, InvalidGameException {
        if(!GameStorage.getInstace().getGames().containsKey(gameId)){
            throw new InvalidParamException("Nu exista joc cu acest id!");
        }
        Game game = GameStorage.getInstace().getGames().get(gameId);

        if(game.getPlayer2() != null) {
            throw new InvalidGameException("Jocul nu mai este valabil!");

        }
        game.setPlayer2(player2);
        game.setStatus(IN_PROGRESS);
        GameStorage.getInstace().setGame(game);
        return game;
        }
    public Game connectToRandomGame(Player player2) throws NotFoundException {
        Game game = GameStorage.getInstace().getGames().values().stream().filter(it->it.getStatus()
                    .equals(NEW)).findFirst().orElseThrow(()->new NotFoundException("Jocul nu a fost gasit!"));
        game.setPlayer2(player2);
        game.setStatus(IN_PROGRESS);
        GameStorage.getInstace().setGame(game);
        return game;
    }
    }

