package saf.game;

import java.io.IOException;

/**
 * This class contains all properties of a fighter bot
 **/
public class Game {
    private Bot bot1;
    private Bot bot2;

    public Game(Bot bot1, Bot bot2) {
        this.bot1 = bot1;
        this.bot2 = bot2;
        
        bot1.setPosition(0.);
        bot2.setPosition(20.);
    }
    
    public void runTimeStep() throws IOException {
        byte a[] = new byte[20];
        while (a[0] != 'q') {
            bot1.compareStrengthConditions(bot2);
            bot2.compareStrengthConditions(bot1);
            bot1.compareRangeConditions(bot2);
            bot2.compareRangeConditions(bot1);
            
            bot1.determineMoveAndAttackByRules();
            bot2.determineMoveAndAttackByRules();        
            
            bot1.moveOtherAccordingToState(bot2);
            bot2.moveOtherAccordingToState(bot1);
            
            bot1.attackOtherAccordingToState(bot2);
            bot2.attackOtherAccordingToState(bot1);
            System.out.println( bot1.botSummaryAsString() );
            System.out.println( bot2.botSummaryAsString() );
            
            if (bot1.isDead() || bot2.isDead() ) {
                break;
            }
            
            System.in.read(a);
        }
    }
    
}

// private class Configuration {
//     
// }