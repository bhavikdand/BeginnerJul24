package tictactoe.controllers;

import tictactoe.exceptions.InvalidBotCountException;
import tictactoe.models.Game;
import tictactoe.models.GameStatus;
import tictactoe.models.Player;

import java.util.List;

public class GameController {

    public Game createGame(List<Player> playerList) throws InvalidBotCountException {
        Game game = Game.getBuilder()
                .setPlayers(playerList)
                .build();
        return game;
    }

    public GameStatus getGameStatus(Game game){
        return game.getGameStatus();
    }

    public void printBoard(Game game){
        game.printBoard();
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }
}
