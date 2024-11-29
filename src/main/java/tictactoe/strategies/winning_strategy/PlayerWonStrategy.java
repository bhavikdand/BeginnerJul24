package tictactoe.strategies.winning_strategy;

import tictactoe.models.Cell;

public interface PlayerWonStrategy {

    boolean checkIfWon(Cell cell);
}
