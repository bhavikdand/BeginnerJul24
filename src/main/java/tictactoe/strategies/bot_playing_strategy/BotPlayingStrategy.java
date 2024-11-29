package tictactoe.strategies.bot_playing_strategy;

import adv_lc_1.generics.intro.Pair;
import tictactoe.models.Board;

public interface BotPlayingStrategy {
    public Pair<Integer, Integer> makeMove(Board board);
}
