package saf.classes;

import java.util.List;

public class Bot {

	private String _name = "";
	private List<Characteristic> _characteristics = null;
	private List<Behaviour> _behaviours = null;

	public String get_name() {
		return _name;
	}

	public List<Characteristic> get_characteristics() {
		return _characteristics;
	}

	public List<Behaviour> get_behaviours() {
		return _behaviours;
	}

	public Bot(String name, List<Characteristic> characteristics, List<Behaviour> behaviours)
	{
		this._name = name;
		this._characteristics = characteristics;
		this._behaviours = behaviours;
	}
	
	public String ToString(){
		return _name;	
	}
}