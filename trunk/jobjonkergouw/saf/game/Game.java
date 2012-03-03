package saf.game;


/**
 * This class contains all properties of a fighter bot
 **/
public class Game {
    private Bot bot1;
    private Bot bot2;
    private double bot1Position;
    private double bot2Position;
    
    private void runTimeStep() {
        BotCondition bc1 = new BotCondition(bot1, bot2, bot1Position, bot2Position)
        bot1.chooseBehaviour();
        bot2.chooseBehaviour();
        
        
        
    }
    
}

private class Configuration {
    
}