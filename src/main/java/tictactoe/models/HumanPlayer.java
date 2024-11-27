package tictactoe.models;

import adv_lc_1.generics.intro.Pair;

import java.util.Scanner;

public class HumanPlayer extends Player{

    public HumanPlayer(char symbol, String name) {
        super(symbol, name);
    }

    @Override
    Pair<Integer, Integer> makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = scanner.nextInt();
        System.out.println("Enter x:");
        int y = scanner.nextInt();
        return new Pair<>(x,y);
    }

    void undo(){

    }
}
