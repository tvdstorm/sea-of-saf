tree grammar SAFChecker;

options
{
    k = 1;
    ASTLabelType = CommonTree;
    tokenVocab = SAF;
}

@header
{
    import java.util.Arrays;
}

@rulecatch
{
    catch (RecognitionException e)
    {
        throw e;
    }
}

@members
{
    boolean hasAlwaysRule;

    static List<String> states = Arrays.asList( "stronger", "weaker", "much_stronger", "much_weaker", "even", "near", "far", "always");

    static List<String> moveActions = Arrays.asList( "jump", "crouch", "stand", "run_towards", "run_away", "walk_towards", "walk_away");

    static List<String> fightActions = Arrays.asList( "punch_low", "punch_high", "kick_low", "kick_high", "block_low", "block_high");

    static List<String> strengths = Arrays.asList( "punchReach", "kickReach", "kickPower", "punchPower");
}


bot
    :   ^(BOT personality behaviour)
    ;

personality
    :   ^(PERSONALITY characteristic*)
    ;

characteristic
    :   ^(c=CHARACTERISTIC DIGIT)
        {
            if (!strengths.contains($c.text))
            {
                throw new SAFException("Invalid strength: " + $c.text);
            }
        }
    ;

behaviour
    :   ^(BEHAVIOUR rule*)
    ;

rule
    :   ^(RULE condition action)
    ;

condition
    :   ^(CONDITION stateExpression)
    ;

stateExpression
    :   ^(AND state stateExpression)
    |   ^(OR state stateExpression)
    |   state
    ;

state
    :   s=STATE
        {
            if (!states.contains($s.text))
            {
                throw new SAFException("Invalid state: " + $s.text);
            }
            else
            {
                hasAlwaysRule |= ($s.text.equals("always"));
            }
        }
    ;

action
    :   ^(ACTION moveAction fightAction)
    ;

moveAction
    :   ^(CHOOSE STRING STRING)
    |   STRING
    ;

fightAction
    :   ^(CHOOSE STRING STRING)
    |   STRING
    ;
