package tictactoe.strategies.winning_strategy;

import tictactoe.models.Cell;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderOneWinningStrategy implements PlayerWonStrategy{

    List<HashMap<Character, Integer>> rowMaps;
    List<HashMap<Character, Integer>> colMaps;
    HashMap<Character, Integer> diagonalMap;
    HashMap<Character, Integer> reverseDiagonalMap;
    int size;

    public OrderOneWinningStrategy(int size) {
        this.size = size;
        this.rowMaps = new ArrayList<>();
        for(int i=0; i<size; i++){
            this.rowMaps.add(new HashMap<>());
        }
        this.colMaps = new ArrayList<>();
        for(int i=0; i<size; i++){
            this.colMaps.add(new HashMap<>());
        }
        this.diagonalMap = new HashMap<>();
        this.reverseDiagonalMap = new HashMap<>();
    }

    @Override
    public boolean checkIfWon(Cell cell) {
        /*
        Step #1: Update the hashmaps
        Step #2: Check if the player has won using the hashmaps
         */
        //Step #1
        int x = cell.getX();
        int y = cell.getY();
        char symbol = cell.getPlayer().getSymbol();
        rowMaps.get(x).put(symbol, rowMaps.get(x).getOrDefault(symbol, 0) + 1);
        colMaps.get(y).put(symbol, colMaps.get(y).getOrDefault(symbol, 0) + 1);

        if(checkIfCellIsOnDiagonal(x,y)){
            diagonalMap.put(symbol, diagonalMap.getOrDefault(symbol, 0) + 1);
        }

        if(checkIfCellIsOnReverseDiagonal(x,y)){
            reverseDiagonalMap.put(symbol, reverseDiagonalMap.getOrDefault(symbol, 0) + 1);
        }


        //Step #2:
        if(rowMaps.get(x).get(symbol) == size){
            return true;
        }

        if(colMaps.get(y).get(symbol) == size){
            return true;
        }

        if(checkIfCellIsOnDiagonal(x,y)){
            return diagonalMap.get(symbol) == size;
        }

        if(checkIfCellIsOnReverseDiagonal(x,y)){
            return reverseDiagonalMap.get(symbol) == size;
        }

        return false;
    }

    private boolean checkIfCellIsOnDiagonal(int x, int y){
        return x == y;
    }

    private boolean checkIfCellIsOnReverseDiagonal(int x, int y){
        return x + y == this.size - 1;
    }
}
