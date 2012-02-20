package saf.syntax;

import java.util.Arrays;
import java.util.List;

import saf.check.CheckLog;

public class Action extends ASTNode
{
    private Evaluable condition;
    private Response move;
    private Response attack;

    public Action(Evaluable condition, Response move, Response attack)
    {
        this.condition = condition;
        this.move = move;
        this.attack = attack;
    }

    public Response getMove() { return move; }
    public Response getAttack() { return attack; }

    public boolean isAlways()
    {
        return condition.isAlways();
    }

    public boolean matches(List<State> situation)
    {
        return condition.evaluate(situation);
    }

    public List<Response> getResponses()
    {
        return Arrays.asList(move, attack);
    }

    @Override
    public void check(CheckLog log)
    {
        condition.check(log);

        if (!move.isMove())
        {
            log.add(new saf.check.Error("Invalid move response \""
                                        + move.toString() + "\"", this));
        }
        if (!attack.isAttack())
        {
            log.add(new saf.check.Error("Invalid attack response \""
                                        + attack.toString() + "\"", this));
        }
    }

    public String toString()
    {
        return condition.toString() + " [" + move.toString() + " "
            + attack.toString() + "]";
    }
}
