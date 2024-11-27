package tictactoe.models;

import adv_lc_1.generics.intro.Pair;

public class Bot extends Player{

    public Bot(char symbol, String name, BotLevel botLevel) {
        super(symbol, name);
        this.botLevel = botLevel;
    }

    private BotLevel botLevel;
    @Override
    Pair<Integer, Integer> makeMove() {
        return null;
    }
}
