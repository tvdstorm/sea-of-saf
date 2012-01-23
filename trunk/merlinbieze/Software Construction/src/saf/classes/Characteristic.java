package saf.classes;

public class Characteristic {

	private String _type = "";
	private Integer _value = 0;
	
	public Characteristic(String type, Integer value){
		this._type = type;
		this._value = value;
	}

	public String get_type() {
		return _type;
	}

	public Integer get_value() {
		return _value;
	}

}