package tictactoe.strategies.bot_playing_strategy;

import adv_lc_1.generics.intro.Pair;
import tictactoe.models.Board;
import tictactoe.models.Cell;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{

    @Override
    public Pair<Integer, Integer> makeMove(Board board) {
        for(List<Cell> row: board.getGrid()){
            for(Cell cell: row){
                if(cell.isEmpty()){
                    return new Pair<>(cell.getX(), cell.getY());
                }
            }
        }
        return null;
    }
}
