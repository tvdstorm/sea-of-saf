package data;
import core.BaseTreePrinter;

public class Characteristic extends BaseData {

	private final String name;
	private final int value;
	
	public Characteristic(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public int getValue() {
		return value;
	}

	@Override
	public void acceptTreePrinter(BaseTreePrinter treePrinter) {
		treePrinter.visit(this);
	}
	
}
