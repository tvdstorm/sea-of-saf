package simulation;

class Simulator {
    Fighter leftFighter;
    Fighter rightFighter;

    public Simulator(String leftFileName, String rightFileName)
    {
        /* Parse left and right file names to get fighters that you can use to
         * create new simulation.Fighters. */
        this.leftFighter = new Fighter(leftFileName);
        this.rightFighter = new Fighter(rightFileName);
    }

    public void runSimulation()
    {
        while (leftFighter.isAlive() && rightFighter.isAlive())
        {
            leftFighter.tick();
            if (leftFighter.mayAttack())
            {
            }
        }
    }
}

