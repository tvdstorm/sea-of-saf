package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Characteristic")
public class Characteristic {
	@XmlAttribute
	private String name;
	
	@XmlAttribute
	private int value;
	
	public String getName() {
		return name;
	}
	
	public int getValue() {
		return value;
	}
}
