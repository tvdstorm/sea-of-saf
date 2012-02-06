package model;

import javax.xml.bind.annotation.*;

@XmlType(name = "action")
public class Action {
	
	@XmlAttribute
	private String value;

	public String getValue() {
		return value;
	}
}
