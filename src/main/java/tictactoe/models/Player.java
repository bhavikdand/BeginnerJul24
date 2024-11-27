package tictactoe.models;

import adv_lc_1.generics.intro.Pair;

public abstract class Player {
    protected String name;
    protected char symbol;

    public Player(char symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    abstract Pair<Integer, Integer> makeMove();

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
