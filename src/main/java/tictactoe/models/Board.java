package tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> grid;

    public Board(int size) {
        grid = new ArrayList<>(size);
        for(int row=0; row<size; row++){
            List<Cell> rowArr = new ArrayList<>();
            for(int col=0; col<size; col++){
                rowArr.add(new Cell(row, col));
            }
            grid.add(rowArr);
        }
    }

    public void printBoard() {
        for(List<Cell> row: grid){
            for(Cell cell: row){
                cell.print();
                System.out.print("|");
            }
            System.out.println();
        }
    }

    public void setPlayer(int x, int y, Player player) {
        Cell cell = this.grid.get(x).get(y);
        cell.setPlayer(player);
    }

    public Cell getCell(int x, int y){
        return this.grid.get(x).get(y);
    }
}
