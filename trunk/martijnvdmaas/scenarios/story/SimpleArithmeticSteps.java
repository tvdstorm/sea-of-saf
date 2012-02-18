package story;

import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class SimpleArithmeticSteps extends org.jbehave.core.steps.Steps implements List<String> {
    private SimpleArithmetic simpleArithmetic;
    private String[] result;

    @org.jbehave.core.annotations.Given("an instance of SimpleArithmetic")
    public void createSimpleArithmetic() {
        simpleArithmetic = new SimpleArithmetic();
    }
    
    @org.jbehave.core.annotations.When("I add $first to $second")
    public void add(final String firstArgument, final String secondArgument) {
        String inputLine = firstArgument + "+" + secondArgument;
        result = simpleArithmetic.formatSolution(inputLine);
    }
    
    @org.jbehave.core.annotations.When("I multiply $first by $second")
    public void multiply(final String firstArgument, final String secondArgument) {
        String inputLine = firstArgument + "*" + secondArgument;
        result = simpleArithmetic.formatSolution(inputLine);
    }
    
    @org.jbehave.core.annotations.Then("the result should be $expectedResult")
    public void checkResult(final String expectedResult) {
        String[] expectedLines = expectedResult.split("\n");
        assertEquals("Incorrect # of lines, " + result.length + " instead of " + expectedLines.length, 
                expectedLines.length-1, result.length);
        for (int i = 0; i < result.length; i++) {
            String expectedLine = expectedLines[i+1];
            String actualLine = result[i];
            assertEquals("Line " + i + " was wrong", expectedLine, actualLine);
        }
    }

	@Override
	public boolean add(String e)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(int index, String element)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addAll(Collection<? extends String> c)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends String> c)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object o)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String get(int index)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<String> iterator()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object o)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<String> listIterator()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<String> listIterator(int index)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String remove(int index)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> c)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String set(int index, String element)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<String> subList(int fromIndex, int toIndex)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a)
	{
		// TODO Auto-generated method stub
		return null;
	}
}
