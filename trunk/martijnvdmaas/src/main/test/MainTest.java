package main.test;

import game.test.GameTest;
import grammar.test.GrammarTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	GrammarTest.class,
	GameTest.class
})
public class MainTest {

}