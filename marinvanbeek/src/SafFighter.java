public class SafFighter
{
    String name;
    SafAttribute[] attributes;
    SafBehaviour behaviour;

    public SafFighter(String name, SafAttribute[] attributes, SafBehaviour behaviour)
    {
        this.name = name;
        this.attributes = attributes;
        this.behaviour = behaviour;
    }
}

class SafAttribute
{
    public static final String[] LEGAL = {"punch_power", 
                                          "punch_reach", 
                                          "kick_power", 
                                          "kick_reach"};

    public SafAttribute()
    {
    }
}

class SafBehaviour
{
    SafBehaviour()
    {
    }
}

class SafCondition
{
    public static final String[] LEGAL = {"stronger",
                                          "much_stronger",
                                          "weaker",
                                          "much_weaker",
                                          "even",
                                          "near",
                                          "far"};

    public static final String[] REQUIRED = {"always"};
}

class SafMove
{
    public static final String[] LEGAL = {"jump",
                                          "crouch",
                                          "stand",
                                          "walk_towards",
                                          "run_towards",
                                          "walk_away",
                                          "run_away"};
}

class SafAttack
{
    public static final String[] LEGAL = {"punch_low",
                                          "punch_high",
                                          "kick_low",
                                          "kick_high",
                                          "block_low",
                                          "block_high"};
}

//class SafMove extends SafAction
//{
//}

