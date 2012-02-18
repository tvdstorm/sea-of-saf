package saf.data;

import java.util.Random;

public interface RandomGenerator<T>
{
    public T getRandom(Random random);
}

