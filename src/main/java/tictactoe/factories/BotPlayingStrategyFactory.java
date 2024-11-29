package tictactoe.factories;

import tictactoe.models.BotLevel;
import tictactoe.strategies.bot_playing_strategy.BotPlayingStrategy;
import tictactoe.strategies.bot_playing_strategy.EasyBotPlayingStrategy;

import java.lang.reflect.Member;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategy(BotLevel level){
        if(level == BotLevel.EASY){
            return new EasyBotPlayingStrategy();
        }
        else if (level == BotLevel.MEDIUM){
            return new EasyBotPlayingStrategy();
        }
        return null;
    }
}
