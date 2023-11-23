package com.javamaster.storage;
import com.javamaster.model.Game;

import java.util.HashMap;
import java.util.Map;

public class GameStorage {
    private static Map<String, Game> games;
    private static GameStorage instace;

    private GameStorage(){
        games= new HashMap<>();

    }
    public static synchronized GameStorage getInstace(){
        if(instace==null){
            instace = new GameStorage();
        }
        return instace;

    }
    public Map<String, Game> getGames(){
        return games;
    }

    public void setGame(Game game) {
        games.put(game.getGameId(), game);
    }



}
