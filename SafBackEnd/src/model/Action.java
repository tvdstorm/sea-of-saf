package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "action")
public class Action {
	
	@XmlAttribute
	private String value;

	public String getValue() {
		return value;
	}
}
