package tictactoe;

import tictactoe.controllers.GameController;
import tictactoe.exceptions.InvalidBotCountException;
import tictactoe.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) throws InvalidBotCountException {
        GameController gameController = new GameController();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of human players");
        int n = scanner.nextInt();
        List<Player> playerList = new ArrayList<>();
        //Create 2 sets for making sure that name and symbols are unique
        for(int i=0; i<n; i++){
            System.out.println("Enter name:");
            String name = scanner.next();
            System.out.println("Enter symbol:");
            char symbol = scanner.next().charAt(0);
            Player humanPlayer = new HumanPlayer(symbol, name);
            playerList.add(humanPlayer);
        }
        System.out.println("Are bots going to play? (Y/N)");
        if(scanner.next().charAt(0) == 'Y'){
            System.out.println("Enter bot level: (E/M/H)");
            char level = scanner.next().charAt(0);
            BotLevel botLevel = BotLevel.EASY;
            if(level == 'E'){
                botLevel = BotLevel.EASY;
            }
            if(level == 'M'){
                botLevel = BotLevel.MEDIUM;
            }
            if(level == 'H'){
                botLevel = BotLevel.HARD;
            }
            playerList.add(new Bot('B', "Bot - 1", botLevel));
        }

        Game game = gameController.createGame(playerList);

        while (gameController.getGameStatus(game) == GameStatus.IN_PROGRESS){
            gameController.printBoard(game);
            gameController.makeMove(game);

        }

        if(gameController.getGameStatus(game) == GameStatus.WON){
            Player winner = gameController.getWinner(game);
            System.out.println(winner.getName() +" with symbol: " + winner.getSymbol() + " has won");
            gameController.printBoard(game);
        } else {
            System.out.println("Game has drawn");
        }
    }
}
